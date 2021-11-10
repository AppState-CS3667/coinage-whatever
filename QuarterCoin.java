/**
  QuarterCoin

  USD coin valued at 0.25.

  @author hottellbt
  @version 1
  */
public class QuarterCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public QuarterCoin() {
        super(0.25, "USD", new QuarterCoinImprint(), new QuarterCoinSmelt());
    }
}
