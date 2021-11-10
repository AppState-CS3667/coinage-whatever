import org.junit.jupiter.api.Test;

/**
  A test class for DateHelper class.

  @author team 'whatever'
  @version Nov 06
  */
public class DateHelperTest {

    /**
      Test the output of DateHelper class.
      */
    @Test
    public void testValue() {
        TestHelper.assertEquals(DateHelper.getYear(), 2021);
    }
}

