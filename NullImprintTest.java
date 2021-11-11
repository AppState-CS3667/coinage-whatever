import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

  /**
    A test class for a coin instance imprint feature.
    @author team 'whatever'
    @version Nov 10
    */
public class NullImprintTest {

    private static AbstractCoin coin;

   /**
   Create the coin instance used later.
   */
    @BeforeEach
    public void createCoin() {
        coin =  NullCoin.getInstance();
    }

    /**
      AbstractCoin toString test.
     */
    @Test
    public void testImprintOutput() {
        TestHelper.assertEquals((coin.getImprintSpecs(), "No Specification");
    }
}
