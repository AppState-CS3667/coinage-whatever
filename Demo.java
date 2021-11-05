import java.util.Scanner;

/**
  Demo

  Runs the Demo for the Coins application.

  @author hottellbt and team 'whatever'
  @version Nov 3
  */
public class Demo {

    private static final double[] ALL_USD = { 
        0.01, 0.05, 0.1, 0.25, 0.5, 1.0 };

    private static final double[] ALL_EUR = {
        0.01, 0.02, 0.05, 0.10, 0.25, 0.5, 1.0, 2.0 };

    // CAD & GBP not implemented yet
    // private static double[] ALL_CAD = {};
    // private static double[] ALL_GBP = {};
    
    /**
      main

      The program starts here.

      @param args System command line arguments (ignored).
      */
    public static void main(String[] args) {
        System.out.println("We are making coins here.");

        String argMintName = getArg(args, 0);
        String argCoinValueStr = getArg(args, 1);

        demoUSD();
        demoEUR();
    }

    /**
      getMint

      Gets a mint based on the given name.

      @param mintName the name of the mint
      @return the Mint that corresponds to mintName
      */
    private static Mint getMint(String mintName) {
        switch(mintName.trim().toLowerCase()) {
            case "usd":
                return USDMint.getInstance();
            case "eur":
                return EURMint.getInstance();

            // these files are not coded up yet
            /*
            case "cad":
                return CADMint.getInstance();
            case "gbp":
                return GBPMint.getInstance();
            */

            case "null":
            case "mint":
                return MockMint.getInstance();
            default:
                return null;
        }
    }

    /**
      demoEUR

      Shows off the EURMint.
      */
    private static void demoEUR() {
        Mint mint = EURMint.getInstance();
        mint.makeCoin(0.01);
        mint.makeCoin(0.02);
        mint.makeCoin(0.05);
        mint.makeCoin(0.10);
        mint.makeCoin(0.25);
        mint.makeCoin(0.50);
        mint.makeCoin(1.00);
        mint.makeCoin(2.00);
    }

    /**
      demoUSD

      Shows off the USDMint.
      **/
    private static void demoUSD() {
        Mint mint = USDMint.getInstance();
        mint.makeCoin(0.01);
        mint.makeCoin(0.05);
        mint.makeCoin(0.10);
        mint.makeCoin(0.25);
        mint.makeCoin(0.50);
        mint.makeCoin(1.00);
    }

    /**
      demoMakeCoin

      Makes a coin in the demo.
      Automatically retries when the coin fails.

      @param sc Scanner for user input
      @param mint the mint that will mint the coin
      @param value the value of the coin minted
      */
    private static void demoMakeCoin(Scanner sc, Mint mint, double value) {
        boolean running = true;
        AbstractCoin c;

        while (running) {
            c = mint.makeCoin(value);

            if (c == NullCoin.getInstance()) {
                running = yn(sc, "Coin failed! Try again?");
            }
            else {
                running = false;
            }
        }
    }

    /**
      yn

      Prompts the user for Y/N input.

      @param sc Scanner for user input
      @param prompt What to ask the user
      @return true if Y, false if N
      */
    private static boolean yn(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            System.out.print(" (y/n): ");
            String ln = sc.nextLine();

            if (ln == null) {
                return false;
            }

            ln = ln.strip().toLowerCase();

            if (ln == "y") {
                return true;
            }
            else if (ln == "n") {
                return false;
            }

        }
    }

    /**
      getArg

      Selects an argument from the array.

      @param args Array of arguments
      @param index Which argument to select
      @return the argument, or null if index is out of bounds
      */
    private static String getArg(String[] args, int index) {
        if (index < 0 || index >= args.length) {
            return null;
        }
        return args[index];
    }
}

