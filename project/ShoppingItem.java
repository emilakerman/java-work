/* 
 * Programutvecklingsuppgift
 * ShoppingItem.java
 * Emil Åkerman
 * 2024-12-04
 * https://github.com/emilakerman/java-work
*/

/**
 * 
 * ShoppingItem custom record is the basis
 * for each shopping item that is added to
 * an ArrayList within the ShoppingList record.
 * 
 */
package project;

public record ShoppingItem(double price, String itemName) {
    public ShoppingItem(double price, String itemName) {
        this.price = price;
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return itemName;
    }
}
