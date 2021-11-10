/**
  EURMint

  A mint for Europe.

  @author blankenshipgm
  @version Nov 04
  */
public class EURMint extends Mint {

    private static EURMint instance;

    /**
      Creates a new EURMint instance.
      */
    private EURMint() {
    }

    @Override
    public AbstractCoin createBaseCoin(double denomination) {

        if (denomination == 0.01) {
            return new EuroCentCoin();
        }
        else if (denomination == 0.02) {
            return new TwoEuroCentCoin();
        }
        else if (denomination == 0.05) {
            return new FiveEuroCentCoin();
        }
        else if (denomination == 0.10) {
            return new TenEuroCentCoin();
        }
        else if (denomination == 0.25) {
            return new TwentyEuroCentCoin();
        }
        else if (denomination == 0.5) {
            return new FiftyEuroCentCoin();
        }
        else if (denomination == 1.0) {
            return new OneEuroCoin();
        }
        else if (denomination == 2.0) {
            return new TwoEuroCoin();
        }

        // Can't make a coin from the given denomination
        return NullCoin.getInstance();
    }

    @Override
    public String toString() {
        return "EUR Mint";
    }

    /**
      There is only one of these objects in existence (singleton).

      @return the only instance.
      */
    public static EURMint getInstance() {
        if (instance == null) {
            instance = new EURMint();
        }
        return instance;
    }
}

