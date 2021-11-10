/**
  ImprintStrategy

  Defines a strategy object for a coin's imprinting process.

  @author hottellbt
  @version 1
  */
public interface ImprintStrategy {
    /**
      imprint

      Actually does the imprinting.

      @param self the coin to imprint

      @return true if successful
      */
    boolean imprint(AbstractCoin self);
}
