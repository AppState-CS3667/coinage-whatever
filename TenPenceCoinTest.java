import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
  A test class for a coin instance.

  @author team 'whatever'
  @version Nov 06
  */
public class TenPenceCoinTest {

    private static AbstractCoin coin;

    /**
      Create the coin instance used later.
      */
    @BeforeEach
    public void createCoin() {
        coin = new TenPenceCoin();
    }

    /**
      Test the value of the coin.
      */
    @Test
    public void testValue() {
        TestHelper.assertEquals(coin.getValue(), 0.10);
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
        TestHelper.startIntercepting();
        System.out.print(coin);

        TestHelper.assertEquals(
                "[value=0.1,countryCode=GBP]",
                TestHelper.stopIntercepting());
    }
}

