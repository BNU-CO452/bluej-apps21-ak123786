
/**
 * Method loads the stock app as a program
 *
 * @author (Akes Ali)
 * @version (23/11/2021)
 */
public class Program
{
    private static StockApp app;
    
    public static void main(String[] args)
    {
        app = new StockApp();
        app.run();
    }
}
