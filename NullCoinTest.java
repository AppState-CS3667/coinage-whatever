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
            NullCoin nullCoin = null;

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
        NullCoin nullCoin = null;
        nullCoin = nullCoin.getInstance();
        
        double expectedValue = 0.0d;
        double testValue = 0;

        testValue = nullCoin.getValue();

        assertEquals(expectedValue, testValue,
                 "Expected: " + expectedValue
                 + ", but got: " + testValue);
    }

    /**
      NullCoin countryCode test
      */
    @Test
    public void testCountryCode() {
        NullCoin nullCoin = null;
        nullCoin = nullCoin.getInstance();

        String expectedCountry = "No Country";
        String testCountry = null;

        testCountry = nullCoin.getCountryCode();

        assertEquals(expectedCountry, testCountry,
                 "Expected: " + expectedCountry
                 + ", but got: " + testCountry);
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

        PrintStream origOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(baos);
        System.setOut(newOut);

        System.out.print(nullCoin);

        System.out.flush();
        testOutput = baos.toString();
        System.setOut(origOut);

        assertTrue(expectedResult.equals(testOutput),
               "Expected:'" + expectedResult
               + "' but got '" + testOutput + "'.");
    }
}

