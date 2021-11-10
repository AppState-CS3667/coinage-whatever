/**
  DimeCoin

  USD coin valued at 0.10.

  @author hottellbt
  @version 1
  */
public class DimeCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public DimeCoin() {
        super(0.1, "USD", new DimeCoinImprint());
    }
}
