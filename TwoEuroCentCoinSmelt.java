/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class TwoEuroCentCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("TwoEuroCentCoinSmelt: " + coin);
        return true;
    }

    @Override
    public String getSpecs() {
        return "Unknown";
    }
}

