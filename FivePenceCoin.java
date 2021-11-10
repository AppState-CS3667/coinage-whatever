/**
  FivePenceCoin

  GBP coin valued at 0.05.

  @author turnerpj
  @version 1
  */
public class FivePenceCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public FivePenceCoin() {
        super(0.05, "GBP", new FivePenceCoinImprint());
    }
}

