/**
  HalfDollarCoin

  USD coin valued at 0.50.

  @author hottellbt
  @version 1
  */
public class HalfDollarCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public HalfDollarCoin() {
        super(0.5, "USD", new HalfDollarCoinImprint());
    }
}
