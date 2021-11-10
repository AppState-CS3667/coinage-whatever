/**
  SmeltStrategy

  Defines a strategy object for a coin's smelting process.

  @author hottellbt
  @version 1
  */
public interface SmeltStrategy {
    /**
      smelt

      Actually does the smelting.

      @param self the coin to smelt

      @return true if successful
      */
    boolean smelt(AbstractCoin self);

    /**
      getSpecs

      The smelt specification is a string that represents the metals used.

      @return a string reprsenting the smelt specification
      */
    String getSpecs();
}
