import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
  NullCoinTest

  tests the null coin class.

  @author team 'whatever'
  @version Nov 03
  */
public class NullCoinTest {

    /**
      NullCoin instance test.
      */
    @Test
    public void testInstance() {
        try {
            assertNotNull(NullCoin.getInstance());
        }
        catch (Exception e) {
            e.printStackTrace();
            fail("NullCoin.getInstance() threw exception: " + e.getMessage());
        }
    }

    /**
      NullCoin value test.
      */
    @Test
    public void testValues() {
        NullCoin nullCoin = NullCoin.getInstance();
        
        double expectedValue = 0.0d;
        double testValue = nullCoin.getValue();

        TestHelper.assertEquals(expectedValue, testValue);
    }

    /**
      NullCoin countryCode test.
      */
    @Test
    public void testCountryCode() {
        NullCoin nullCoin = NullCoin.getInstance();

        String expectedCountry = "No Country";
        String testCountry = nullCoin.getCountryCode();

        TestHelper.assertEquals(expectedCountry, testCountry);
    }

    /**
      NullCoin toString test.
      */
    @Test
    public void testToString() {
        NullCoin nullCoin = null;
        nullCoin = nullCoin.getInstance();

        String expectedResult = "[value=0.0,countryCode=No Country]";
        String testOutput = null;

        TestHelper.startIntercepting();

        System.out.print(nullCoin);

        testOutput = TestHelper.stopIntercepting();

        TestHelper.assertEquals(expectedResult, testOutput);
    }
}

