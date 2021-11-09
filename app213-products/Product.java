/**
 * Model some details of a product sold by a company.
 * 
 * @author Akes Ali
 * @version 02/11/2021
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        
        quantity = 0;
    }

    /**
     * return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Set the quantity of the products
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    /**
     * Increase the quantity if the products
     */
    public void increaseQuantity(int amount)
    {
        quantity = quantity + amount;
    }
    
    /**
     * Decrease the quantity of the products
     */
    public void decreaseQuantity(int amount)
    {
        if(quantity >= amount)
            quantity = quantity - amount;
    }
    
    /**
     * return The id, name and quantity in stock.
     */
    public String toString()
    {
        return " ID " + id + ": " +  name + " stock level: " + quantity;
    }

    /**
     * Print the id, name and quantity
     */
    public void print()
    {
        System.out.println(toString());
    }
}