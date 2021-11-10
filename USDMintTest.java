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
    };
    
    /**
      Tests how the mint will react to good, valid coins.
     */
    @Test
    public void testValidCoins() {
        for (int i = 0; i < VALUES.length; i++) {
            double val = VALUES[i];
            AbstractCoin c = MINT.createBaseCoin(val);
            if (c == null) {
                fail("Issue with value " + val + " : returned null");
            }
            else if (NullCoin.getInstance().equals(c)) {
                fail("Issue with value " + val + ": returned NullCoin");
            }
            else if (!COUNTRY_CODE.equals(c.getCountryCode())) {
                fail("Issue with value " + val
                        + ": returns coin with incorrect country code "
                        + "(Country code should be \"USD\")");
            }
            else if (c.getValue() != val) {
                fail("Issue with value " + val
                        + ": returned coin with value " + val
                        + " when coin value should be " + c.getValue());
            }
        }
    }

    /**
      Tests how the mint will react to very bad valued coins.
     */
    @Test
    public void testVeryBadCoins() {
        for (int i = 0; i < VERY_BAD_VALUES.length; i++) {
            double val = VERY_BAD_VALUES[i];
            AbstractCoin c = MINT.createBaseCoin(val);

            if (c == null) {
                fail("Issue with value " + val + " : returned null");
            }
            else if (c != NullCoin.getInstance()) {
                fail("Issue with value " + val + " : didn't return NullCoin "
                    + "when it was should of.");
            }
        }
        
    }

}
