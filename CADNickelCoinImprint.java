/**
  A concrete realization of an imprint strategy.
  
  @author team 'whatever'
  @version 1
  */
public class CADNickelCoinImprint implements ImprintStrategy {

    @Override
    public boolean imprint(AbstractCoin coin) {
        System.out.println("CADNickelCoinImprint: " + coin);
        return true;
    }
}

