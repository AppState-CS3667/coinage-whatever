import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
  A test class fora coin instance.
  
  @author edwardscm6
  @version Nov 09 
  */
public class NickelCoinTest {

    private static AbstractCoin coin;

    /**
      Creates a coin instance for use later.
     */
    @BeforeEach
    public void createCoin() {
        coin = new NickelCoin();
    }

    /**
      Tests the value of the coin.
    */
    @Test
    public void testValue() {
        TestHelper.assertEquals(coin.getValue(), 0.05);
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
                "[value=0.05,countryCode=USD]",
                coin.toString());
    }
}
