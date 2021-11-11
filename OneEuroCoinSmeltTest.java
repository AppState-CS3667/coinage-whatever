import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

  /**
    A test class for a coin instance smelt feature.
    @author team 'whatever'
    @version Nov 10
    */
public class OneEuroCoinSmeltTest {

    private static AbstractCoin coin;

   /**
   Create the coin instance used later.
   */
    @BeforeEach
    public void createCoin() {
        coin = new OneEuroCoin();
    }

    /**
     Test the country code of the coin.
     */
    @Test
    public void testSmeltSpecs() {
        TestHelper.assertEquals(coin.getSmeltSpecs(), "Unknown");
    }

    /**
      AbstractCoin toString test.
     */
    @Test
    public void testSmeltOutput() {
        TestHelper.assertEquals(
                "OneEuroCoinSmelt: [value=1.0,countryCode=EUR]",
                "OneEuroCoinSmelt: " + coin);
    }
}

