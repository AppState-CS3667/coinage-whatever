import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
  A test class for a coin instance.

  @author team 'whatever'
  @version Nov 06
  */
public class FiveEuroCentCoinTest {

    private static AbstractCoin coin;

    /**
      Create the coin instance used later.
      */
    @BeforeEach
    public void createCoin() {
        coin = new FiveEuroCentCoin();
    }

    /**
      Test the value of the coin.
      */
    @Test
    public void testValue() {
        TestHelper.assertEquals(coin.getValue(), 0.05);
    }

    /**
      Test the country code of the coin.
      */
    @Test
    public void testCountryCode() {
        TestHelper.assertEquals(coin.getCountryCode(), "EUR");
    }

    /**
      AbstractCoin toString test.
      */
    @Test
    public void testToString() {
        TestHelper.assertEquals(
                "[value=0.05,countryCode=EUR]",
                coin.toString());
    }
}

