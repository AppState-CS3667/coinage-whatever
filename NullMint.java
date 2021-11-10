/**
  NullMint

  A mint that only creates failed coins.

  @author hottellbt
  @version Nov 03
  */
public class NullMint extends Mint {

    private static NullMint instance;

    /**
      Creates a new NullMint instance.
      */
    private NullMint() {
    }

    @Override
    public AbstractCoin createBaseCoin(double denomination) {
        return NullCoin.getInstance();
    }

    @Override
    public String toString() {
        return "Null Mint";
    }

    /**
      There is only one MockMint in existence.

      @return the only NullMint.
      */
    public static NullMint getInstance() {
        if (instance == null) {
            instance = new NullMint();
        }
        return instance;
    }
}

