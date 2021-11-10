/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class TenEuroCentCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("TenEuroCentCoinSmelt: " + coin);
        return true;
    }

    @Override
    public String getSpecs() {
        return "Unknown";
    }
}

