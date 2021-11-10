/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class QuarterCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("QuarterCoinSmelt: " + coin);
        return true;
    }

    @Override
    public String getSpecs() {
        return "91.67% Cu 8.33% Ni";
    }
}

