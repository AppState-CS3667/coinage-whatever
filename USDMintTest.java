import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

/**
  Test class for USDMint.
  
  @author edwardscm6
  @version Nov 9
 */
public class USDMintTest {

    //Static variables for testing.
    private static final Mint MINT = USDMint.getInstance();
    private static final String COUNTRY_CODE = "USD";
    private static final double[] VALUES = new double[] {
        0.01, 0.05, 0.10, 0.25, 0.5, 1.0
    };
    private static final double[] VERY_BAD_VALUES = new double[] {
        -1.0, 0.0, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY
    }
    
    /**
      Tests how the mint will react to good, valid coins
     */
    @Test
    public void testValidCoins() {
        for (double val : VALUES) {
            AbstractCoin c = MINT.smeltCoin(val);
            if (c = null) {
                fail("Issue with value " + val + " : returned null";)
            }
            if (NullCoin.getInstance().equals(c)) {
                fail("Issue with value " + val + ": returned NullCoin");
            }
            if (!COUNTRY_CODE.equals(c.getCountryCode())) {
                fail("Issue with value " + val
                        + ": returns coin with incorrect country code "
                        + "(Country code should be \"USD\")");
            }
            if (c.getValue() != val) {
                fail("Issue with value " + val
                        + ": returned coin with value " + val
                        + " when coin value should be " + c.getValue());
            }
        }
    }
}
