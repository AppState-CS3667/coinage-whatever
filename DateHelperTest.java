import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

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
        DateHelper date = new DateHelper();

        TestHelper.assertEquals(date.getYear(), 2021);
    }
}

