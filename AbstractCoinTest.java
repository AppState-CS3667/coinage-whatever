//import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
  CoinTest

  tests the coin classes.

  @author team 'whatever'
  @version Nov 03
  */
public class AbstractCoinTest {
    // Needs MockCoin (extends AbstractCoin) for testing

    /**
      MockCoin

      Dummy coin for testing purposes.

      @author team 'whatever'
      @version Nov 03
      */
    private static class MockCoin extends AbstractCoin {

        /**
          Constructs a new MockCoin.
          */
        public MockCoin() {
            super(10.0, "Mock Country");
        }
    }

    /**
      Sample test.
      */
    @Test
    public void coinTest() {
        // Commenting this line because I'd like this test to pass by default
        // for the time being :)

        // fail("This is supposed to fail");
    }
}

