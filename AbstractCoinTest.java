import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
  AbstractCoinTest

  tests the abstract coin class.

  @author team 'whatever'
  @version Nov 04
  */
public class AbstractCoinTest {

    /**
      MockCoin class used for testing abstract coin class.

      @author team 'whatever'
      @version Nov 04
      */
    private static class MockCoin extends AbstractCoin {
        /** Create a new MockCoin. */
        public MockCoin() {
            super(0.0, "Mock Country", new NullImprint(), new NullSmelt());
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
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }
    }

    /**
      AbstractCoin value test.
      */
    @Test
    public void testValues() {
        AbstractCoin mockCoin = new MockCoin();
        
        double expectedValue = 0.0d;
        double testValue = mockCoin.getValue();

        TestHelper.assertEquals(expectedValue, testValue);
    }

    /**
      AbstractCoin countryCode test.
      */
    @Test
    public void testCountryCode() {
        AbstractCoin mockCoin = new MockCoin();

        String expectedCountry = "Mock Country";
        String testCountry = mockCoin.getCountryCode();

        TestHelper.assertEquals(expectedCountry, testCountry);
    }

    /**
      AbstractCoin toString test.
      */
    @Test
    public void testToString() {
        AbstractCoin mockCoin = new MockCoin();

        String expectedResult = "[value=0.0,countryCode=Mock Country]";
        String testOutput = null;

        TestHelper.startIntercepting();

        System.out.print(mockCoin);

        testOutput = TestHelper.stopIntercepting();

        TestHelper.assertEquals(expectedResult, testOutput);
    }
}

