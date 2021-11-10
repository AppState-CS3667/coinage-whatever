/**
  TwoPoundCoin

  GBP coin valued at 2.00.

  @author turnerpj
  @version 1
  */
public class TwoPoundCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public TwoPoundCoin() {
        super(2.00, "GBP", new TwoPoundCoinImprint());
    }
}

