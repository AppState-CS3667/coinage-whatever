/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class DollarCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("DollarCoinSmelt: " + coin);
        return true;
    }

    @Override
    public String getSpecs() {
        return "88.5% Cu 6% Zi 3.5% Mn 2% Ni";
    }
}

