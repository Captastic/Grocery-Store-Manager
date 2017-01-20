package capriotti.anthony.GroceryManager;

/**
 * Created by anthonycapriotti on 1/20/17.
 */
public class Manager {

    public static void initializeInventory() {
        //one object
        Product product1 = new Product(1, "Apple", 6, 1.50);
        System.out.println("Total value of inventory: " + Inventory.getSum(product1));

        Product product2 = new Product(2, "Chicken", 6, 5.00);
        System.out.println("Total quantity of inventory: " + Inventory.getQuantity(product2));

    }
}
