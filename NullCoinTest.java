import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
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
            assertNotNull(nullCoin.getInstance());
        } catch (Exception e) {
            fail("Instance was found to be null: " + e.getMessage());
        }
    }

    /**
      NullCoin value test
      */
    @Test
    public void testValues() {
        NullCoin nullCoin = nullCoin.getInstance();
        
        double expectedValue = 0.0d;
        double testValue = nullCoin.getValue();

        TestHelper.assertEquals(expectedValue, testValue);
    }

    /**
      NullCoin countryCode test
      */
    @Test
    public void testCountryCode() {
        NullCoin nullCoin = nullCoin.getInstance();

        String expectedCountry = "No Country";
        String testCountry = nullCoin.getCountryCode();

        TestHelper.assertEquals(expectedCountry, testCountry);
    }

    /**
      NullCoin toString test
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

