import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

  /**
    A test class for a coin instance imprint feature.
    @author team 'whatever'
    @version Nov 10
    */
public class CADDimeCoinImprintTest {

    private static AbstractCoin coin;

   /**
   Create the coin instance used later.
   */
    @BeforeEach
    public void createCoin() {
        coin = new CADDimeCoin();
    }

    /**
      AbstractCoin toString test.
     */
    @Test
    public void testSmeltOutput() {
        TestHelper.assertEquals(
                "CADDimeCoinImprint: [value=0.1,countryCode=CAD]",
                "CADDimeCoinImprint: " + coin);
    }
}
