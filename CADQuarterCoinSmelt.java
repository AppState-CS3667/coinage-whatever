/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class CADQuarterCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("CADQuarterCoinSmelt: " + coin);
        return true;
    }
}

