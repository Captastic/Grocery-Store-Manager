package capriotti.anthony.GroceryManager;

import java.util.ArrayList;

/**
 * Created by anthonycapriotti on 1/19/17.
 */
public class Inventory {
    static ArrayList<Product> inventory = new ArrayList<Product>();

    public static double getSum(Product product){
        return product.quantity * product.price;
    }
    public static int getQuantity(Product quantity){
        return quantity.quantity;
    }
}
