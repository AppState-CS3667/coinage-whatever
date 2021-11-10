/**
  TwentyPenceCoin

  GBP coin valued at 0.20.

  @author turnerpj
  @version 1
  */
public class TwentyPenceCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public TwentyPenceCoin() {
        super(
                0.20,
                "GBP",
                new TwentyPenceCoinImprint(),
                new TwentyPenceCoinSmelt());
    }
}

