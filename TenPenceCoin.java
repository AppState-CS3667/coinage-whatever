/**
  TenPenceCoin

  GBP coin valued at 0.10.

  @author turnerpj
  @version 1
  */
public class TenPenceCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public TenPenceCoin() {
        super(0.10, "GBP", new TenPenceCoinImprint(), new TenPenceCoinSmelt());
    }
}

