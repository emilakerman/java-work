/* 
 * Programutvecklingsuppgift
 * ShoppingTest.java
 * Emil Åkerman
 * 2024-12-06
 * https://github.com/emilakerman/java-work
*/

/**
 * 
 * This is the main application that runs the shopping system.
 * You can run this by typing "java ShoppingTest.java" in the CLI.
 */
package project;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingTest {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        // List Containing lists
        ShoppingSystem system = new ShoppingSystem();
        ShoppingList[] lists = system.getLists();
        boolean exitProgram = false;

        while (!exitProgram) {
            // Prints the main menu options.
            VisualUtilities.printMainMenu();
            int choice = inputReader.nextInt();
            inputReader.nextLine();
            ArrayList<ShoppingItem> shoppingList = new ArrayList<>();
            // Main Menu Switch Options.
            switch (choice) {
                case 1:
                    createShoppingList(shoppingList, lists, inputReader);
                    break;
                case 2:
                    addToList(true, shoppingList, lists, null, inputReader);
                    break;
                case 3:
                    displayShoppingLists(lists);
                    break;
                case 4:
                    exitProgram = true;
                    System.out.println("Thank you for using our system, Goodbye my friend!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        inputReader.close();
    }

    // Creates a shopping list and adds it to the array of shopping lists.
    private static void createShoppingList(ArrayList<ShoppingItem> shoppingList, ShoppingList[] lists,
            Scanner inputReader) {
        System.out.print("Enter a name for your Shopping List: ");
        String listName = inputReader.nextLine();
        boolean listNameIsBlank = listName.isBlank();
        while (listNameIsBlank) {
            if (listName.isBlank()) {
                System.out.println("The name cant be blank.");
                System.out.print("Enter a name for your Shopping List: ");
                listName = inputReader.nextLine();
            } else {
                listNameIsBlank = false;
            }
        }
        System.out.println("You have named your Shopping List: " + listName);

        boolean addingItems = true;

        while (addingItems) {
            addToList(false, shoppingList, lists, listName, inputReader);
            System.out.print("Add another item? (yes/no): ");
            String response = inputReader.nextLine().trim().toLowerCase();
            addingItems = response.equals("yes");
        }

        // Create and add the new shopping
        // Asks for day and converts to LocalDate datatype as per instructions.
        System.out.print("Enter the date (day of year 1-365 for this list, only one list per day) " + listName + ": ");
        int currentYear = LocalDate.now().getYear();
        int selectedDay = inputReader.nextInt();
        LocalDate selectedDate = Year.of(currentYear).atDay(selectedDay);

        ShoppingList newList = new ShoppingList(listName, shoppingList, selectedDate);
        // Checks for duplicate lists. Since we want unique lists for each day.
        if (!lists[selectedDay].isPlaceholder()) {
            System.out.println("You already have a list for that day! Would you like to replace it?");
            inputReader.nextLine();
            String response = inputReader.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                return;
            }
        }
        lists[selectedDay] = newList;
    }

    // Reusable method that both adds items to an existing list and to a list
    // currently being created.
    public static void addToList(boolean addingToExisting, ArrayList<ShoppingItem> shoppingList,
            ShoppingList[] lists, String listName,
            Scanner inputReader) {
        // Checks if any real users lists are present and displays messages in
        // accordance.
        if (!checkHasAnyUserLists(lists) && addingToExisting) {
            System.out.println("You have no shopping lists.");
        } else {
            // Deals with adding an item to an existing list.
            if (addingToExisting) {
                boolean stillAdding = true;
                while (stillAdding) {
                    System.out.println("Which of the following lists would you like to add an item to?");
                    System.out.println("Enter the name of the list, case sensitive.");
                    for (ShoppingList list : lists) {
                        if (list.isPlaceholder())
                            continue;
                        System.out.println("- List: " + list.getName() + " with " + list.getItemCount() + " items.");
                    }

                    listName = inputReader.nextLine();
                    ArrayList<String> tempList = new ArrayList<String>();
                    for (ShoppingList list : lists) {
                        tempList.add(list.getName());
                    }
                    // Checks if the list the user has input actually exists
                    if (!tempList.contains(listName)) {
                        System.out.println("That list does not exist!.");
                        stillAdding = true;
                    } else {
                        stillAdding = false;
                    }
                }
            }
            // Deals with input of the item name.
            System.out.print("Enter the name of an item to add to " + listName + ": ");
            String itemName = inputReader.nextLine();
            boolean itemNameIsBlank = itemName.isBlank();
            while (itemNameIsBlank) {
                if (itemName.isBlank()) {
                    System.out.println("The item name cant be blank.");
                    System.out.print("Enter a name for your shopping item: ");
                    itemName = inputReader.nextLine();
                } else {
                    itemNameIsBlank = false;
                }
            }
            // Deals with input of the item price.
            System.out.print("Enter the price of " + itemName + ": ");
            double itemPrice = inputReader.nextDouble();
            boolean itemPriceIsBlank = itemPrice < 0;
            while (itemPriceIsBlank) {
                if (itemPrice < 0) {
                    System.out.println("The item price cant be blank.");
                    System.out.print("Enter a price for your shopping item: ");
                    itemPrice = inputReader.nextDouble();
                } else {
                    itemPriceIsBlank = false;
                }
            }

            inputReader.nextLine();

            // Add the item to the selected shopping list
            ShoppingItem item = new ShoppingItem(itemPrice, itemName);
            if (addingToExisting) {
                for (ShoppingList list : lists) {
                    if (list.getName().equals(listName)) {
                        // Add item to specific list
                        list.addItem(item);
                        break;
                    }
                }

            } else {
                shoppingList.add(item);
            }
            VisualUtilities.printItemAddedResults(item, listName);
        }
    }

    // Checks if the user has any own created lists or if only placeholders exist.
    private static boolean checkHasAnyUserLists(ShoppingList[] lists) {
        boolean hasRealLists = false;
        for (ShoppingList list : lists) {
            if (!list.isPlaceholder()) {
                hasRealLists = true;
            }
        }
        if (!hasRealLists) {
            hasRealLists = false;
        }
        return hasRealLists;
    }

    // Displays any existing lists in a readable format.
    private static void displayShoppingLists(ShoppingList[] lists) {
        if (!checkHasAnyUserLists(lists)) {
            System.out.println("You have no shopping lists.");
            return;
        }
        System.out.println("Your Shopping Lists:");
        VisualUtilities.addSpacing();
        for (ShoppingList list : lists) {
            if (!list.isPlaceholder()) {
                VisualUtilities.printShoppingLists(list);
                for (ShoppingItem item : list.getListItemNames()) {
                    VisualUtilities.printItemsInShoppingList(item);
                }
            }
        }
        VisualUtilities.addSpacing();
    }
}
