/**
 Twenty EuroCentCoin

  EUR coin valued at 0.25 according to the ASULearn assignment page (no,
  really, go check it).

  @author blankenshipgm
  @version 2
  */
public class TwentyEuroCentCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public TwentyEuroCentCoin() {
        super(
                // The assignment details say a twenty euro cent coin has a
                // value of 25.
                0.25,
                "EUR",
                new TwentyEuroCentCoinImprint(),
                new TwentyEuroCentCoinSmelt());
    }
}
