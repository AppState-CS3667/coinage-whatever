/**
  FiftyPenceCoin

  GBP coin valued at 0.50.

  @author turnerpj
  @version 1
  */
public class FiftyPenceCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public FiftyPenceCoin() {
        super(0.50, "GBP", new FiftyPenceCoinImprint());
    }
}

