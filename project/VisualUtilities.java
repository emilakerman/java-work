/* 
 * Programutvecklingsuppgift
 * VisualUtilties.java
 * Emil Åkerman
 * 2024-12-06
 * https://github.com/emilakerman/java-work
*/

/**
 * 
 * Class that deals with some visual utilites
 * such as messages to the user and spacing.
 * 
 */
package project;

public class VisualUtilities {

    public static void printItemsInShoppingList(ShoppingItem item) {
        System.out.println("    - Item: " + item.getName() + " - " + item.getPrice() + " KR.");
    }

    public static void printShoppingLists(ShoppingList list) {
        System.out.println("- List: '" + list.getName() + "' with " + list.getItemCount()
                + " items. For the date " + list.getListDate());
    }

    public static void printItemAddedResults(ShoppingItem item, String listName) {
        System.out.println("Added " + item.getName() + " to " + listName
                + " with a price of " + item.getPrice());
    }

    public static void addSpacing() {
        System.out.println();
        System.out.println();
    }

    public static void printMainMenu() {
        System.out.println("Welcome to the Shopping App!");
        addSpacing();
        System.out.println("1. Create a new Shopping List");
        System.out.println("2. Add Item To Existing List");
        System.out.println("3. View Shopping Lists");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
}
