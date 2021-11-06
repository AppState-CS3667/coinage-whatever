import java.util.Scanner;

/**
  Demo

  Runs the Demo for the Coins application.

  @author turnerpj and team 'whatever'
  @version Nov 3
  */
public class Demo {

    private static final String STR_INVALID_MINT = 
        "What? I've never heard of that mint!";

    private static final String STR_INVALID_DOUBLE =
        "Invalid decimal number.";

    private static final double[] ALL_USD = { 
        0.01, 0.05, 0.1, 0.25, 0.5, 1.0 };

    private static final double[] ALL_EUR = {
        0.01, 0.02, 0.05, 0.10, 0.25, 0.5, 1.0, 2.0 };

    private static final double[] ALL_CAD = {
        0.05, 0.1, 0.25, 0.5, 1.0, 2.0 };

    // GBP not implemented yet
    // private static final double[] ALL_GBP = {};
    
    /**
      main

      The program starts here.

      @param args System command line arguments.
      */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            runDemo(args, sc);
        }
        catch (Exception e) {
            System.err.println("An exception occurred while running the demo.");
            e.printStackTrace();
        }
    }

    /**
      runDemo

      Runs the demo.

      @param args command line arguments
      @param sc user input
      */
    private static void runDemo(String[] args, Scanner sc) {

        if (getArg(args, 0, "").equalsIgnoreCase("all")) {
            // special demo: make all coins
            makeAllCoins(sc);
            return;
        }

        System.out.println("We are making coins.");

        String argMintName = getArg(args, 0, null);
        String argCoinValueStr = getArg(args, 1, null);

        // mint as selected by user args
        // if null, user didn't specify a mint
        // (we specify the mint later interactively in that case)
        Mint argMint = null;

        // double as selected by user args
        // if null, user didn't specify a value
        // (we specify the value later interactively)
        Double argCoinValue = null;

        if (argMintName != null) {
            argMint = getMint(argMintName);

            if (argMint == null) {
                System.out.println(STR_INVALID_MINT);
                System.exit(1);
            }
        }

        if (argCoinValueStr != null) {
            argCoinValue = tryParseDouble(argCoinValueStr);

            if (argCoinValue == null) {
                System.out.println(STR_INVALID_DOUBLE);
                System.exit(1);
            }
        }

        // interactive if the user left one or more args out
        boolean interactive = argMint == null || argCoinValue == null;

        // the loop keeps going if we are in an interactive session
        do {

            // recall that argMint is null if we are interactive
            Mint mint = argMint;

            // recall that argCoinValue is null if we are interactive
            Double coinValue = argCoinValue;

            while (mint == null) {
                mint = getMint(prompt(sc, "Which mint?"));

                if (mint == null) {
                    System.out.println(STR_INVALID_MINT);
                    // don't exit, let the user try again
                }
            }

            while (coinValue == null) {
                coinValue = tryParseDouble(prompt(sc, "Which coin value?"));

                if (coinValue == null) {
                    System.out.println(STR_INVALID_DOUBLE);
                }
            }

            demoMakeCoin(sc, mint, coinValue);

        } while(interactive);
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
            case "cad":
                return CADMint.getInstance();

            /*
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

        do {
            c = mint.makeCoin(value);

            if (c == NullCoin.getInstance()) {
                running = yn(sc, "Coin failed! Try again?");
            }
            else {
                running = false;
            }
        } while(running);

        System.out.println("Got this coin object:");
        System.out.println(c.getClass());
        System.out.println(c);
    }

    /**
      yn

      Prompts the user for Y/N input.

      @param sc Scanner for user input
      @param prompt What to ask the user
      @return true if Y, false if N or the input ended abruptly
      */
    private static boolean yn(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            System.out.print(" (y/n): ");

            if (!sc.hasNextLine()) {
                return false;
            }

            String ln = sc.nextLine();

            if (ln == null) {
                return false;
            }

            ln = ln.strip().toLowerCase();

            if (ln.equals("y")) {
                return true;
            }
            else if (ln.equals("n")) {
                return false;
            }

        }
    }

    /**
      prompt

      Asks the user for a nonempty string.
      
      @param sc Scanner for user input
      @param prompt What to ask the user
      @return what the user wrote, or null if there is no more input
      */
    private static String prompt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            System.out.print(": ");

            if (!sc.hasNextLine()) {
                System.out.println("Input ended abruptly!");
                System.exit(1);
            }

            String given = sc.nextLine();

            if (given == null) {
                System.out.println("Input ended abruptly!");
                System.exit(1);
            }

            given = given.trim();

            if (!given.isEmpty()) {
                return given;
            }
        }
    }

    /**
      tryParseDouble

      Attempts to parse a string as a double.

      @param str The string to parse
      @return null if it failed, or a nonnull double if successful.
      */
    private static Double tryParseDouble(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Double.parseDouble(str);
        }
        catch (NumberFormatException nfe) {
            return null;
        }
    }

    /**
      getArg

      Selects an argument from the array.

      @param args Array of arguments
      @param index Which argument to select
      @param def Default value if argument isn't specified
      @return the argument, or def if index is out of bounds
      */
    private static String getArg(String[] args, int index, String def) {
        if (index < 0 || index >= args.length) {
            return def;
        }
        return args[index];
    }

    /**
      makeAllCoins

      Makes all the coins across all mints.

      @param sc user input
      */
    private static void makeAllCoins(Scanner sc) {
        mintForEach(sc, USDMint.getInstance(), ALL_USD);
        mintForEach(sc, EURMint.getInstance(), ALL_EUR);
        mintForEach(sc, CADMint.getInstance(), ALL_CAD);
        // mintForEach(sc, GBPMint.getInstance(), ALL_GBP);
    }

    /**
      mintForEach

      For loop to reduce code duplication.

      @param sc user input
      @param mint the mint that makes coins
      @param values the denominations of coins to make
      */
    private static void mintForEach(Scanner sc, Mint mint, double[] values) {
        for (double value : values) {
            demoMakeCoin(sc, mint, value);
        }
    }
}

