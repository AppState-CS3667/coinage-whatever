/**
  Mint

  A factory for AbstractCoin instances.

  @author hottellbt
  @version not a template edition
  */
public abstract class Mint {

    /**
      createBaseCoin

      Creates the base coin that will be processed.

      @param denomination the value of the base coin.

      @return a newly made coin object that has yet to be imprinted/smelted
      */
    protected abstract AbstractCoin createBaseCoin(double denomination);

    // subclasses are required to give themselves a good name
    @Override
    public abstract String toString();

}
