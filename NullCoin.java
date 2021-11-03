/**
  NullCoin

  Null Object and singleton pattern applied to a coin.

  !!! NOT THREAD SAFE !!!

  @author hottellbt
  @version Nov 03
  */
public class NullCoin extends AbstractCoin {

    private static NullCoin instance;

    /**
      Construct a new NullCoin.
      */
    private NullCoin() {
        super(0.0d, "No Country");
    }
    
    /**
      Get the single NullCoin instance.

      @return the instance
      */
    public static NullCoin getInstance() {
        if (instance == null) {
            instance = new NullCoin();
        }
        return instance;
    }
}

