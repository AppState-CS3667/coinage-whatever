import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

  /**
    A test class for a coin instance imprint feature.
    @author team 'whatever'
    @version Nov 10
    */
public class TwentyEuroCentCoinImprintTest {

    private static AbstractCoin coin;

   /**
   Create the coin instance used later.
   */
    @BeforeEach
    public void createCoin() {
        coin = new TwentyEuroCentCoin();
    }

    /**
      AbstractCoin toString test.
     */
    @Test
    public void testSmeltOutput() {
        TestHelper.assertEquals(
                // The assignment details say a twenty euro cent coin is 0.25
                "TwentyEuroCentCoinImprint: [value=0.25,countryCode=EUR]",
                "TwentyEuroCentCoinImprint: " + coin);
    }
}
