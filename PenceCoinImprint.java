/**
  A concrete realization of an imprint strategy.
  
  @author team 'whatever'
  @version 1
  */
public class PenceCoinImprint implements ImprintStrategy {

    @Override
    public boolean imprint(AbstractCoin coin) {
        System.out.println("PenceCoinImprint: " + coin);
        return true;
    }
}

