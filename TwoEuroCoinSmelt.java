/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class TwoEuroCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("TwoEuroCoinSmelt: " + coin);
        return true;
    }

    @Override
    public String getSpecs() {
        return "Unknown";
    }
}

