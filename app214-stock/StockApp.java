
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Akes Ali
 * @version 23/11/2021
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    public Product product;
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        
        else if(choice.equals("remove"))
        {
            removeProduct();
        }
        else if(choice.equals("buy"))
        {
            buyProduct();
        }
        else if(choice.equals("sell"))
        {
            sellProduct();
        } 
        else if(choice.equals("search"))
        {
            searchProduct();
        }
        else if(choice.equals("low stock"))
        {
            stock.printLowStock();
        }
        else if(choice.equals("restock"))
        {
            stock.lowStockList();
        }
        return false;
    }
    
    public void addProduct()
    {
        int id = reader.getInt("Please enter the ID: ");
        String name = reader.getString("Please enter the name of the product: ");
        Product product = new Product(id, name);
        stock.add(product);
        System.out.println("Product " + product.getID() 
        + ", " + product.getName() + " has been ADDED");
    }    
    
    public void removeProduct()
    {
        int id = reader.getInt("Please enter the ID: ");
        stock.removeProductViaID(id);
        System.out.println("Product has been removed");
    }
    
    public void buyProduct()
    {
        int id = reader.getInt("Please enter the ID: ");
        int amount = reader.getInt("Please enter sell amount >");  
  
        Product product = stock.findProduct(id);
        stock.sellProduct(id, amount);
        stock.print();    
        System.out.println("Sold " + amount + " of " 
        + product.getName());
    }
    
    public void sellProduct()
    {
        int id = reader.getInt("Please enter the ID: ");
        int amount = reader.getInt("Please enter sell amount >");
            
        Product product = stock.findProduct(id);
        stock.sellProduct(id, amount);
        stock.print();
            
        System.out.println("Sold " + amount + " of " 
        + product.getName());
    } 
    
    public void searchProduct()
    {
        String name = reader.getString("Please enter the name: ");
        if (product.getName() == name)
        {
            System.out.println(product);
        }
        else
        {
            System.out.println("Couldn't find product");
        }
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Print:      Print all product");
        System.out.println("    Quit:       Quit the program");
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Buy:        Buy a product");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Search:     Search for a product");
        System.out.println("    Low Stock:  List of low stock");
        System.out.println("    Restock:    Restock all low stock");
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by AK");
        System.out.println("********************************");
    }
}