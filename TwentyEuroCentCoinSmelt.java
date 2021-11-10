/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class TwentyEuroCentCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("TwentyEuroCentCoinSmelt: " + coin);
        return true;
    }
}

