package capriotti.anthony.GroceryManager;


/**
 * Created by anthonycapriotti on 1/19/17.
 */
public class Product {
    static protected String name;
    static protected int quantity;
    static protected double price;
    static protected int productId;

    public Product(){}

    public Product(int productId, String name, int quantity, double price){
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        Inventory.inventory.add(this);
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
}
