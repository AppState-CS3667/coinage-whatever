/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class TwentyPenceCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("TwentyPenceCoinSmelt: " + coin);
        return true;
    }

    @Override
    public String getSpecs() {
        return "84% Cu 16% Ni";
    }
}

