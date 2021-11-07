import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
  A test class for a coin instance.

  @author team 'whatever'
  @version Nov 06
  */
public class TwoPoundCoinTest {

    private static AbstractCoin coin;

    /**
      Create the coin instance used later.
      */
    @BeforeEach
    public void createCoin() {
        coin = new TwoPoundCoin();
    }

    /**
      Test the value of the coin.
      */
    @Test
    public void testValue() {
        TestHelper.assertEquals(coin.getValue(), 2.00);
    }

    /**
      Test the country code of the coin.
      */
    @Test
    public void testCountryCode() {
        TestHelper.assertEquals(coin.getCountryCode(), "GBP");
    }

    /**
      AbstractCoin toString test.
      */
    @Test
    public void testToString() {
        TestHelper.assertEquals(
                "[value=2.0,countryCode=GBP]",
                coin.toString());
    }
}

