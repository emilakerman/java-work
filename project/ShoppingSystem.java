/* 
 * Programutvecklingsuppgift
 * ShoppingTest.java
 * Emil Åkerman
 * 2024-12-06
 * https://github.com/emilakerman/java-work
*/

/**
 * 
 * Main Shopping System class with 365 populated arraylist indexes.
 * 
 */
package project;

import java.time.LocalDate;
import java.util.ArrayList;

public class ShoppingSystem {
    private ShoppingList[] lists;

    public ShoppingSystem() {
        this.lists = new ShoppingList[365];
        ArrayList<ShoppingItem> emptyList = new ArrayList<ShoppingItem>();
        // Populating the list with placeholders that are replaced by real entries
        // later.
        for (int i = 0; i < 365; i++) {
            lists[i] = new ShoppingList("Placeholder", emptyList, LocalDate.now(), true);
        }
    }

    public ShoppingList[] getLists() {
        return lists;
    }
}