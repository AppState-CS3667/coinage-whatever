import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

/**
  A test class for a coin instance.

  @author team 'whatever'
  @version Nov 06
  */
public class EURMintTest {

    private static final Mint MINT = EURMint.getInstance();

    private static final String COUNTRY_CODE = "EUR";

    private static final double[] VALUES = new double[]{
        0.01, 0.02, 0.05, 0.10, 0.25, 0.50, 1.00, 2.00
    };

    private static final double[] BOGUS_VALUES = new double[] {
        -1.00, 0.00, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY
    };

    /**
      Test how the mint acts when it is given a valid, expected value.
      */
    @Test
    public void testValidCoins() {
        for (double value : VALUES) {

            /*
            NOTE! You have to do "smeltCoin" because if you do createCoin
            then the coin creation might fail because it's doing a bunch of
            other things that replace the result with NullCoin.
            */
            AbstractCoin c = MINT.smeltCoin(value);

            if (c == null) {
                fail("Issue with value " + value + ": returns null");
            }

            if (NullCoin.getInstance().equals(c)) {
                fail("Issue with value " + value + ": returns NullCoin");
            }

            if (!COUNTRY_CODE.equals(c.getCountryCode())) {
                fail("Issue with value " + value
                        + ": returns coin that belongs to another country");
            }

            if (c.getValue() != value) {
                fail("Issue with value " + value
                        + ": returns coin with incorrect value");
            }
        }
    }

    /**
      Test how the mint acts when it is given a bogus value.
      */
    @Test
    public void testBogusCoins() {
        for (double value : BOGUS_VALUES) {
            AbstractCoin c = MINT.smeltCoin(value);

            if (c == null) {
                fail("Issue with value " + value + ": returns null");
            }

            if (c != NullCoin.getInstance()) {
                fail("Issue with value " + value + ": doesn't return NullCoin");
            }
        }
    }

}

