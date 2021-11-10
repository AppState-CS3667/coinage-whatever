/**
  TwoEuroCoin

  EUR coin valued at 2.0.

  @author blankenshipgm
  @version 1
  */
public class TwoEuroCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public TwoEuroCoin() {
        super(2.0, "EUR", new TwoEuroCentCoinImprint());
    }
}
