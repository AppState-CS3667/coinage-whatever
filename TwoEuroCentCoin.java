/**
 TwoEuroCentCoin

  EUR coin valued at 0.02.

  @author blankenshipgm
  @version 1
  */
public class TwoEuroCentCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public TwoEuroCentCoin() {
        super(0.02, "EUR", new TwoEuroCentCoinImprint());
    }
}
