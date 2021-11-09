import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
  A test class for a coin instance.
  
  @author edwardscm6
  @version Nov 09 
  */
public class DollarCoinTest {

    private static AbstractCoin coin;

    /**
      Creates a coin instance for use later.
     */
    @BeforeEach
    public void createCoin() {
        coin = new DollarCoin();
    }

    /**
      Tests the value of the coin.
    */
    @Test
    public void testValue() {
        TestHelper.assertEquals(coin.getValue(), 1.00);
    }

    /**
      Tests the country code of the coin.
     */
    @Test
    public void testCountryCode() {
        TestHelper.assertEquals(coin.getCountryCode(), "USD");
    }

    /**
      Tests AbstractCoin toString.
     */
    @Test
    public void testToString() {
        TestHelper.assertEquals(
                "[value=1.0,countryCode=USD]",
                coin.toString());
    }
}
