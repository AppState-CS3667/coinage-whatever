import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

  /**
    A test class for a coin instance smelt feature.
    @author team 'whatever'
    @version Nov 10
    */
public class TwoPenceCoinSmeltTest {

    private static AbstractCoin coin;

   /**
   Create the coin instance used later.
   */
    @BeforeEach
    public void createCoin() {
        coin = new TwoPenceCoin();
    }

    /**
     Test the country code of the coin.
     */
    @Test
    public void testSmeltSpecs() {
        TestHelper.assertEquals(coin.getSmeltSpecs(), "Cu plated steel");
    }

    /**
      AbstractCoin toString test.
     */
    @Test
    public void testSmeltOutput() {
        TestHelper.assertEquals(
                "TwoPenceCoinSmelt: [value=0.02,countryCode=GBP]",
                "TwoPenceCoinSmelt: " + coin);
    }
}

