import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

  /**
    A test class for a coin instance smelt feature.
    @author team 'whatever'
    @version Nov 10
    */
public class FiftyPenceCoinSmeltTest {

    private static AbstractCoin coin;

   /**
   Create the coin instance used later.
   */
    @BeforeEach
    public void createCoin() {
        coin = new FiftyPenceCoin();
    }

    /**
     Test the country code of the coin.
     */
    @Test
    public void testSmeltSpecs() {
        TestHelper.assertEquals(coin.getSmeltSpecs(), "75% Cu 25% Ni");
    }

    /**
      AbstractCoin toString test.
     */
    @Test
    public void testSmeltOutput() {
        TestHelper.assertEquals(
                "FiftyPenceCoinSmelt: [value=0.5,countryCode=GBP]",
                "FiftyPenceCoinSmelt: " + coin);
    }
}

