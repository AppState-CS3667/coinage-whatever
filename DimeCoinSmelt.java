/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class DimeCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("DimeCoinSmelt: " + coin);
        return true;
    }

    @Override
    public String getSpecs() {
        return "Unknown";
    }
}

