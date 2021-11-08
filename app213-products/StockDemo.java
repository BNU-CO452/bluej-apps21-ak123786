import java.util.ArrayList;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Akes Ali
 * @version 02/11/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    private int amount;
    private int id;
    
    private String title;
    
    public ArrayList<Product> products;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Mercedes AMG GT"));
        stock.add(new Product(102, "BMW M8"));
        stock.add(new Product(103, "Audi RS3"));
        stock.add(new Product(104, "Rolls Royce Wraith"));
        stock.add(new Product(105, "Lamborghini Huracan"));
        stock.add(new Product(106, "Mercedes C63s"));
        stock.add(new Product(107, "Porsche Turbo S"));
        stock.add(new Product(108, "BMW M3"));
        stock.add(new Product(109, "Lamborghini Urus"));
        stock.add(new Product(110, "Range Rover SVR"));
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 4);
        stock.buyProduct(102, 6);
        stock.buyProduct(103, 8);
        stock.buyProduct(104, 10);
        stock.buyProduct(105, 12);
        stock.buyProduct(106, 14);
        stock.buyProduct(107, 16);
        stock.buyProduct(108, 18);
        stock.buyProduct(109, 20);
        stock.buyProduct(110, 20);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 2);
        stock.sellProduct(102, 4);
        stock.sellProduct(103, 6);
        stock.sellProduct(104, 8);
        stock.sellProduct(105, 10);
        stock.sellProduct(106, 12);
        stock.sellProduct(107, 14);
        stock.sellProduct(108, 16);
        stock.sellProduct(109, 18);
        stock.sellProduct(110, 19);
    }    
}