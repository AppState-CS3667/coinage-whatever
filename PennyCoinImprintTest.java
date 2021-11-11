import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

  /**
    A test class for a coin instance imprint feature.
    @author team 'whatever'
    @version Nov 10
    */
public class PennyCoinImprintTest {

    private static AbstractCoin coin;

   /**
   Create the coin instance used later.
   */
    @BeforeEach
    public void createCoin() {
        coin = new PennyCoin();
    }

    /**
      AbstractCoin toString test.
     */
    @Test
    public void testSmeltOutput() {
        TestHelper.assertEquals(
                "PennyCoinImprint: [value=0.01,countryCode=USD]",
                "PennyCoinImprint: " + coin);
    }
}
