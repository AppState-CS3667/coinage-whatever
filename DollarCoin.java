/**
  DollarCoin

  USD coin valued at 1.00.

  @author hottellbt
  @version 1
  */
public class DollarCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public DollarCoin() {
        super(1.00, "USD", new DollarCoinImprint());
    }
}
