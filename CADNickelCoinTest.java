import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

  /**
    A test class for a coin instance.
    @author team 'whatever'
    @version Nov 07
    */
public class CADNickelCoinTest {

    private static AbstractCoin coin;

   /**
   Create the coin instance used later.
   */
    @BeforeEach
    public void createCoin() {
        coin = new CADNickelCoin();
    }

       /**
        Test the value of the coin.
        */
    @Test
    public void testValue() {
        TestHelper.assertEquals(coin.getValue(), 0.05);
    }

    /**
     Test the country code of the coin.
     */
    @Test
    public void testCountryCode() {
        TestHelper.assertEquals(coin.getCountryCode(), "CAD");
    }

    /**
      AbstractCoin toString test.
     */
    @Test
    public void testToString() {
        TestHelper.assertEquals(
                "[value=0.05,countryCode=CAD]",
                coin.toString());
    }
}

