/**
  OneEuroCoin

  EUR coin valued at 1.0.

  @author blankenshipgm
  @version 1
  */
public class OneEuroCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public OneEuroCoin() {
        super(
                1.0,
                "EUR",
                new OneEuroCoinImprint(),
                new OneEuroCoinSmelt());
    }
}
