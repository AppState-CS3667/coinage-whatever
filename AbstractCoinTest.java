import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
  AbstractCoinTest

  tests the abstract coin class.

  @author team 'whatever'
  @version Nov 03
  */
public class AbstractCoinTest {
    /**
      MockCoin class used for testing abstract coin class
      */
    private static class MockCoin extends AbstractCoin {
        public MockCoin() {
            super(0.0, "Mock Country");
        }
    }

    /**
      AbstractCoin instance test.
      */
    @Test
    public void testContructor() {
        try {
            AbstractCoin mockCoin = new MockCoin();

            assertNotNull(mockCoin);
        } catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }
    }

    /**
      AbstractCoin value test
      */
    @Test
    public void testValues() {
        AbstractCoin mockCoin = new MockCoin();
        
        double expectedValue = 0.0d;
        double testValue = 0;

        testValue = mockCoin.getValue();

        assertEquals(expectedValue, testValue,
                 "Expected: " + expectedValue
                 + ", but got: " + testValue);
    }

    /**
      AbstractCoin countryCode test
      */
    @Test
    public void testCountryCode() {
        AbstractCoin mockCoin = new MockCoin();

        String expectedCountry = "Mock Country";
        String testCountry = null;

        testCountry = mockCoin.getCountryCode();

        assertEquals(expectedCountry, testCountry,
                 "Expected: " + expectedCountry
                 + ", but got: " + testCountry);
    }

    /**
      AbstractCoin toString test
      */
    @Test
    public void testToString() {
        AbstractCoin mockCoin = new MockCoin();

        String expectedResult = "[value=0.0,countryCode=Mock Country]";
        String testOutput = null;

        PrintStream origOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(baos);
        System.setOut(newOut);

        System.out.print(mockCoin);

        System.out.flush();
        testOutput = baos.toString();
        System.setOut(origOut);

        assertTrue(expectedResult.equals(testOutput),
               "Expected:'" + expectedResult
               + "' but got '" + testOutput + "'.");
    }
}

