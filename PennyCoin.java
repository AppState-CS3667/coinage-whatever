/**
  PennyCoin

  USD coin valued at 0.01.

  @author hottellbt
  @version 1
  */
public class PennyCoin extends AbstractCoin {
    /** Construct a new coin of this type. */
    public PennyCoin() {
        super(0.01, "USD", new PennyCoinImprint(), new PennyCoinSmelt());
    }
}
