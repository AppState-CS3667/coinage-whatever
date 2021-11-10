import java.time.Year;

/**
  DateHelper

  Contains helper methods to get facts about the current date.

  @author hottellbt
  @version 1
*/
public class DateHelper {

    /**
      getYear

      Gets the year.

      @return the year.
      */
    public static int getYear() {
        return Year.now().getValue();
    }

}


