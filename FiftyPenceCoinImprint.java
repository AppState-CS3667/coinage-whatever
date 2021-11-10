/**
  A concrete realization of an imprint strategy.
  
  @author team 'whatever'
  @version 1
  */
public class FiftyPenceCoinImprint implements ImprintStrategy {

    @Override
    public boolean imprint(AbstractCoin coin) {
        System.out.println("FiftyPenceCoinImprint: " + coin);
        return true;
    }
}

