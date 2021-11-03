import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
  TestHelper

  Responsible for intercepting System.out and returning the intercepted
  text as a String object.

  There are two states: "Intercepting and "Not Intercepting".

  "Intercepting": Everything send to System.out is being intercepted
  and will soon be converted into a String.

  "Not Intercepting": Everything sent to System.out functions as you
  would otherwise expect.

  If you attempt to start intercepting when you are already
  intercepting, then you will get an Exception. Don't do that!

  If you attempt to stop intercepting when you are not already
  intercepting, then you will get an Exception. Don't do that either!

  Use startIntercepting() to start intercepting.

  Use stopIntercepting() to stop intercepting and get a String.

  !!! THE METHODS IN THIS CLASS ARE NOT THREAD SAFE !!!

  @author hottellbt
  @version Nov 3
  */
public class TestHelper {

    // the original System.out before we started intercepting
    private static PrintStream origOut = null;

    // the new System.out that we are intercepting.
    private static ByteArrayOutputStream interceptOut = null;

    private static boolean intercepting = false;

    /**
     startIntercepting

     Starts intercepting the output.
     */
    public static void startIntercepting() {
        if (intercepting) {
            throw new TestHelperException("Already intercepting!");
        }
        intercepting = true;

        origOut = System.out;
        interceptOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(interceptOut));
    }

    /**
      stopIntercepting

      Stop intercepting the output.

      @return the intercepted text.
      */
    public static String stopIntercepting() {
        if (!intercepting) {
            throw new TestHelperException("Not intercepting!");
        }
        intercepting = false;

        System.out.flush();
        String ret = interceptOut.toString();
        System.setOut(origOut);

        try {
            interceptOut.close();
        }
        catch (IOException e) {
            throw new RuntimeException(
                    "What? This shouldn't be possible", e);
        }

        origOut = null;
        interceptOut = null;

        return ret;
    }

    /**
      TestHelperException
      
      Thrown when you call methods in the TestHelper class
      inappropriately.

      @author hottellbt
      @version 1
      */
    public static class TestHelperException extends RuntimeException {

        /**
          Constructs a new TestHelperException.

          @param message The message to scream at the user
          */
        public TestHelperException(String message) {
            super(message);
        }
    }

}
