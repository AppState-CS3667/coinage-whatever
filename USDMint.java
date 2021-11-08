/**
  USDMint

  A mint for the United States of America.

  @author hottellbt
  @version Nov 03
  */
public class USDMint extends Mint {

    private static USDMint instance;

    /**
      Creates a new USDMint instance.
      */
    private USDMint() {
    }

    @Override
    public AbstractCoin smeltCoin(double denomination) {

        // java doesn't like doubles in switch statements
        // i love java until i have to write it :)

        if (denomination == 0.01) {
            return new PennyCoin();
        }
        else if (denomination == 0.05) {
            return new NickelCoin();
        }
        else if (denomination == 0.10) {
            return new DimeCoin();
        }
        else if (denomination == 0.25) {
            return new QuarterCoin();
        }
        else if (denomination == 0.5) {
            return new HalfDollarCoin();
        }
        else if (denomination == 1.0) {
            return new DollarCoin();
        }

        // what the heck???
        // i can't make that!!!
        return null;
    }

    @Override
    public String toString() {
        return "USD Mint";
    }

    /**
      There is only one of these objects in existence (singleton).

      @return the only instance.
      */
    public static USDMint getInstance() {
        if (instance == null) {
            instance = new USDMint();
        }
        return instance;
    }
}

