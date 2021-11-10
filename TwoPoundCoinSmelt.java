/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class TwoPoundCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("TwoPoundCoinSmelt: " + coin);
        return true;
    }

    @Override
    public String getSpecs() {
        return "outer ring: 76% Cu 20% Zi 4% Ni, inner ring: 75% Cu 25% Ni";
    }
}

