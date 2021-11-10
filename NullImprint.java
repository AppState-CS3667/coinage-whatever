/**
  NullImprint

  An imprint strategy that does nothing.

  @author hottellbt
  @version 1
  */
public class NullImprint implements ImprintStrategy {
   
    @Override
    public boolean imprint(AbstractCoin self) {
        // do nothing and always fail!
        return false;
    }
}
