/**
  NullSmelt

  Smelt strategy that does nothing.

  @author hottellbt
  @version 1
  */
public class NullSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin self) {
        // do nothing
        return true;
    }
}
