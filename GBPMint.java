/**
  GBPMint

  A mint for the Great British Pound.

  @author turnerpat
  @version Nov 03
  */
public class GBPMint extends Mint {

    private static GBPMint instance;

    /**
      Creates a new GBPMint instance.
      */
    private GBPMint() {
    }

    @Override
    public AbstractCoin smeltCoin(double denomination) {
        
        if (denomination == 0.01) {
            return new PenceCoin();
        }
        else if (denomination == 0.02) {
            return new TwoPenceCoin();
        }
        else if (denomination == 0.05) {
            return new FivePenceCoin();
        }
        else if (denomination == 0.10) {
            return new TenPenceCoin();
        }
        else if (denomination == 0.20) {
            return new TwentyPenceCoin();
        }
        else if (denomination == 0.50) {
            return new FiftyPenceCoin();
        }
        else if (denomination == 1.00) {
            return new PoundCoin();
        }
        else if (denomination == 2.00) {
            return new TwoPoundCoin();
        }
        else if (denomination == 5.00) {
            return new FivePoundCoin();
        }

        return null;
    }

    @Override
    public String toString() {
        return "GPB Mint";
    }

    /**
      There is only one of these objects in existence (singleton).

      @return the only instance.
      */
    public static GBPMint getInstance() {
        if (instance == null) {
            instance = new GBPMint();
        }
        return instance;
    }
}

