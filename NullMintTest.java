import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

/**
  Test class for NullMint.

  @author edwardscm6
  @version Nov 10
 */
public class NullMintTest {

    // Static variables for testing.
    private static final Mint MINT = NullMint.getInstance();

    /**
      Test for basecoin for NullMint.
     */
    @Test
    public void testBaseCoin() {
      // 0.0 is a placeholder value, has no effect on outcome
        AbstractCoin c = MINT.createBaseCoin(0.0);
        if (!NullCoin.getInstance().equals(c)) {
            fail("Issue with base coin: Was supposed to return "
                + "NullCoin but did not.");
        }
    }

    /**
      Test for NullMint toString.
     */
    @Test
    public void testToString() {
        TestHelper.assertEquals("Null Mint", MINT.toString());
    }
}
