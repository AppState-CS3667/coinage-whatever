/**
  EuroCentCoin

  EUR coin valued at 0.01.

  @author blankenshipgm
  @version 1
  */
public class EuroCentCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public EuroCentCoin() {
        super(0.01, "EUR", new EuroCentCoinImprint());
    }
}
