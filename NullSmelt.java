/**
  NullSmelt

  Smelt strategy that does nothing.

  @author hottellbt
  @version 1
  */
public class NullSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin self) {
        // do nothing and fail
        return false;
    }

    @Override
    public String getSpecs() {
        return "No Specification";
    }
}
