import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

  /**
    A test class for a coin instance imprint feature.
    @author team 'whatever'
    @version Nov 10
    */
public class TwoPoundCoinImprintTest {


    private static AbstractCoin coin;

   /**
   Create the coin instance used later.
   */
    @BeforeEach
    public void createCoin() {
        coin = new TwoPoundCoin();
    }

    /**
      AbstractCoin toString test.
     */
    @Test
    public void testSmeltOutput() {
        TestHelper.assertEquals(
                "TwoPoundCoinImprint: [value=2.0,countryCode=GBP]",
                "TwoPoundCoinImprint: " + coin);
    }
}
