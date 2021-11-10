/**
  PenceCoin

  GBP coin valued at 0.01.

  @author turnerpj
  @version 1
  */
public class PenceCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public PenceCoin() {
        super(0.01, "GBP", new PenceCoinImprint(), new PenceCoinSmelt());
    }
}

