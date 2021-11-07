import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

  /**
    A test class for a coin instance.
    @author team 'whatever'
    @version Nov 07
    */
public class LoonieCoinTest {

    private static AbstractCoin coin;

   /**
   Create the coin instance used later.
   */
    @BeforeEach
    public void createCoin() {
        coin = new LoonieCoin();
    }

       /**
        Test the value of the coin.
        */
    @Test
    public void testValue() {
        TestHelper.assertEquals(coin.getValue(), 1.00);
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
                "[value=1.00,countryCode=CAD]",
                coin.toString());
    }
}

