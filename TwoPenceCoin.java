/**
  TwoPenceCoin

  GBP coin valued at 0.02.

  @author turnerpj
  @version 1
  */
public class TwoPenceCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public TwoPenceCoin() {
        super(0.02, "GBP", new TwoPenceCoinImprint());
    }
}

