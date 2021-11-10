/**
  A concrete realization of a smelt strategy.

  @author team 'whatever'
  @version 1
  */
public class PennyCoinSmelt implements SmeltStrategy {

    @Override
    public boolean smelt(AbstractCoin coin) {
        System.out.println("PennyCoinSmelt: " + coin);
        return true;
    }

    @Override
    public String getSpecs() {
        return "2.5% Cu 97.5% Zi";
    }

}
