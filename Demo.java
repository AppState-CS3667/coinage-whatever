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

        // demo USD
        Mint mint = USDMint.getInstance();
        mint.makeCoin(0.01);
        mint.makeCoin(0.05);
        mint.makeCoin(0.10);
        mint.makeCoin(0.25);
        mint.makeCoin(0.50);
        mint.makeCoin(1.00);

        // demo EUR
        mint = EURMint.getInstance();
        mint.makeCoin(0.01);
        mint.makeCoin(0.02);
        mint.makeCoin(0.05);
        mint.makeCoin(0.10);
        mint.makeCoin(0.25);
        mint.makeCoin(0.50);
        mint.makeCoin(1.00);
        mint.makeCoin(2.00);
    }

}

