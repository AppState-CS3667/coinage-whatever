import java.util.Random;

/**
  Mint

  A factory for AbstractCoin instances.

  @author hottellbt
  @version Nov 03
  */
public abstract class Mint {

    // failure simulation: the return value of failure
    // when we implement NullCoin we will plug it in here
    // for now we have null, because we don't have it yet :(
    private static final AbstractCoin NULL_COIN = null;

    // failure simulation: the source of randomness
    // our source of chance for random failures
    private static final Random RANDOM = new Random();

    /**
      makeCoin

      Mints a coin based on the given name.

      Manufacturing includes four steps:

      1. Manufacture (smelts the metal)
      2. Inspection (imperfect impressions, etc)
      3. Smoothing
      4. Buffing

      Manufacturing is unique to every country, but the other three steps are
      the same everywhere.

      @param denomination the value of the coin in the local currency.
      @return a coin that has gone through the entire process.
      */
    public final AbstractCoin makeCoin(double denomination) {

        // manufacture (actual smelting of metal)
        AbstractCoin coin = smeltCoin(denomination);

        // inspection
        coin = inspectCoin(coin);

        // smoothing
        coin = smoothCoin(coin);

        // buffing
        coin = buffCoin(coin);

        // end result
        return coin;
    }

    /**
      smeltCoin

      Manufactures (smelts) a coin based on the given denomination.

      @param denomination the value of the coin in the local currency.
      @return a newly made coin object
      */
    protected abstract AbstractCoin smeltCoin(double denomination);
    
    /**
      inspectCoin
      
      Inspects a coin.

      @param coin the coin to inspect
      @return the inspected coin, or a NullCoin if the inspection failed.
      */
    private final AbstractCoin inspectCoin(AbstractCoin coin) {
        System.out.print("Inspecting... ");
        return simulateFailure(12, coin);
    }

    /**
      polishCoin

      Polishes a coin.

      @param coin the coin to polish
      @return the polished coin, or a NullCoin if the polishing failed.
      */
    private final AbstractCoin smoothCoin(AbstractCoin coin) {
        System.out.print("Smoothing... ");
        return simulateFailure(1000, coin);
    }

    /**
      buffCoin

      Buffs a coin.

      @param coin the coin to buff
      @return the buffed coin, or a NullCoin if the buffing failed.
      */
    private final AbstractCoin buffCoin(AbstractCoin coin) {
        System.out.print("Buffing... ");
        return simulateFailure(1000, coin);
    }

    /**
      simulateFailure

      Simulates failure as a 1/n chance.

      @param chance the value of n above
      @param coin the coin that could fail

      @return coin if things go smoothly, or NULL_COIN otherwise.
      */
    private static AbstractCoin simulateFailure(int chance, AbstractCoin coin) {

        if (coin == NULL_COIN) {
            // this coin is already ruined!
            System.out.println("SKIPPED");
            return coin;
        }

        if (RANDOM.nextInt(chance) == 0) {
            System.out.println("FAILURE");
            return NULL_COIN;
        }
        else {
            System.out.println("OK");
            return coin;
        }
    }

}
