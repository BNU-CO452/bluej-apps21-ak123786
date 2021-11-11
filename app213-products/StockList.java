import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Akes Ali 
 * @version 02/11/2021
 */
public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a method to add a product to the list.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    public void removeProductViaID(int productID)
    {
        Product product = findProduct(productID);
        if(product != null)
        {
            stock.remove(product);
            System.out.println("Product Removed " + product.getName());
        }
        else
        {
            System.out.println("ID doesn't exist ");
        }
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    /**
     * Buy a quantity of a particular product 
     * which increases the quantity of the product by the given amount.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        if(product != null)
        {
            if(product.getQuantity() < 10)
            {
                product.increaseQuantity(amount);
                System.out.println("Bought " + amount + " of " + product.getName());
                // printout message
            }
            else if(product.getQuantity() == 0)
            {
                System.out.println("Not enough space for " + product.getName()
                                    + ". Please sell the existing stock");
                // printout message
            }
        }
        else
        {
            System.out.println("Couldn't find product");
            //printout message
        }
    }
    
    /**
     * Restock if minimum amount is reached
     */
    public void lowStockList()
    {
        printHeading();
        for(Product product : stock)
            {
             if(product.getQuantity() < 3)
                product.increaseQuantity(10);
            }
            System.out.println();
        for(Product product : stock)
            {
                product.print();
            }
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock)
        {
           if(product.getID() == productID)
           {
                return product;
           }
        }
        return null;
    }
    
    /**
     * Find a product to match the product name
     * if not found return null
     */
    public Product findProductName(String productName)
    {
        for(Product product : stock)
        {
           if(product.getName() == productName)

                return product;
           System.out.print(product);
        }
        return null;
    }
    
    /**
     * A method to sell a single quantity of a product
     */
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
    }
    
    /**
     * Sell  many of a given product.
     * This shows the before and after status of the product.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() > 0)
            {
                product.decreaseQuantity(amount);
                System.out.println(" Sold " + amount + " of "
                + product.getName());
            }
            else
            {
                System.out.println(" The product " + product.getName()
                + " is out of stock ");
            }
        }
        else
        {
            System.out.println("Couldn't find product");
        }
    }    
 
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    /**
     * print out all stock available
     */
    public void printHeading()
    {
        System.out.println();
        System.out.println(" AK's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
}