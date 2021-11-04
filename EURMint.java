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
    public AbstractCoin smeltCoin(double denomination) {

        

        if (denomination == 0.01) {
            return new EuroCent();
        }
        else if (denomination == 0.02) {
            return new TwoEuroCent();
        }
	else if (denomination == 0.05) {
            return new FiveEuroCent();
        }

        else if (denomination == 0.10) {
            return new TenEuroCent();
        }
        else if (denomination == 0.25) {
            return new TwentyEuroCent();
        }
        else if (denomination == 0.5) {
            return new FiftyEuroCent();
        }
        else if (denomination == 1.0) {
            return new OneEuro();
        }
	 else if (denomination == 2.0) {
            return new TwoEuro();
        }

        
        // Cant make a null coin!!!
        return null;
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

