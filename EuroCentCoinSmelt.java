/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class EuroCentCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("EuroCentCoinSmelt: " + coin);
        return true;
    }
}

