/**
  NickelCoin

  USD coin valued at 0.05.

  @author hottellbt
  @version 1
  */
public class NickelCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public NickelCoin() {
        super(0.05, "USD", new NickelCoinImprint());
    }
}
