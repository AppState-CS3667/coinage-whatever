/**
  Demo

  Runs the Demo for the Coins application.

  @author hottellbt and team 'whatever'
  @version Nov 3
  */
public class Demo {
    
    /**
      main

      The program starts here.

      @param args System command line arguments (ignored).
      */
    public static void main(String[] args) {
        System.out.println("We are making coins here.");

        Mint mint = MockMint.getInstance();

        mint.makeCoin(1.00);
    }

}

