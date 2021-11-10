/**
  CADMint
  
  A mint for Canada.
  
  @author edwardscm6
  @version Nov. 5
  */
public class CADMint extends Mint {
    // Field for singleton pattern
    private static CADMint instance;

    //Null Coin to return when smeltCoin fails
    private static final AbstractCoin NULL_COIN = NullCoin.getInstance();

    /**
      Creates a new CADMint instance.
     */
    private CADMint() {
    }

    @Override
    public AbstractCoin createBaseCoin(double denomination) {
        // This if else if statement determines which coin to make
        if (denomination == 2.0) {
            return new ToonieCoin();
        }
        else if (denomination == 1.0) {
            return new LoonieCoin();
        }
        else if (denomination == 0.5) {
            return new FiftyCentCoin();
        }
        else if (denomination == 0.25) {
            return new CADQuarterCoin();
        }
        else if (denomination == 0.1) {
            return new CADDimeCoin();
        }
        else if (denomination == 0.05) {
            return new CADNickelCoin();
        }
        else {
            return NULL_COIN;
        }
    }

    @Override
    public String toString() {
        return "CAD Mint";
    }

    /**
      Singleton to ensure only one instance exists.
      
      @return only one instance.
     */
    public static CADMint getInstance() {
        if (instance == null) {
            instance = new CADMint();
        }
        return instance;
    }
}
