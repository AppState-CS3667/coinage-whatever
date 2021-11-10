/**
  A concrete realization of an imprint strategy.
  
  @author team 'whatever'
  @version 1
  */
public class TwoEuroCentCoinImprint implements ImprintStrategy {

    @Override
    public boolean imprint(AbstractCoin coin) {
        System.out.println("TwoEuroCentCoinImprint: " + coin);
        return true;
    }
}

