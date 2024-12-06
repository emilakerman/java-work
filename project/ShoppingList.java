
/* 
 * Programutvecklingsuppgift
 * ShoppingList.java
 * Emil Åkerman
 * 2024-12-06
 * https://github.com/emilakerman/java-work
*/

/**
 * 
 * This ShoppingList record is the main structural template
 * for how the indivual shopping lists look like.
 * A [ShoppingList] contains a name, a ArrayList<ShoppingItem>,
 * the date for when the shopping is to take place, and a placeholder.
 * Along with some relevant getters.
 * 
 */
package project;

import java.time.LocalDate;
import java.util.ArrayList;

public record ShoppingList(String listName, ArrayList<ShoppingItem> list, LocalDate date, boolean isPlaceholder) {
    public ShoppingList(String listName, ArrayList<ShoppingItem> list, LocalDate date) {
        this(listName, list, date, false);
    }

    public ShoppingList(String listName, ArrayList<ShoppingItem> list, LocalDate date, boolean isPlaceholder) {
        this.listName = listName;
        this.list = list;
        this.date = date;
        this.isPlaceholder = isPlaceholder;
    }

    public String getName() {
        return listName;
    }

    public int getItemCount() {
        return list.size();
    }

    public LocalDate getListDate() {
        return date;
    }

    public ArrayList<ShoppingItem> getListItemNames() {
        ArrayList<ShoppingItem> list2 = new ArrayList<ShoppingItem>();
        for (ShoppingItem item : list) {
            list2.add(item);
        }
        return list2;
    }

    public void addItem(ShoppingItem item) {
        list.add(item);
    }
}
