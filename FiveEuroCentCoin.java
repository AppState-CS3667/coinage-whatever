/**
  FiveEuroCentCoin

  EUR coin that is valued at 0.05.

  @author blankenshipgm
  @version 1
  */
public class FiveEuroCentCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public FiveEuroCentCoin() {
        super(0.05, "EUR", new FiveEuroCentCoinImprint());
    }
}
