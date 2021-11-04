/**
  MockMint

  A very basic and featureless mint.

  @author hottellbt
  @version Nov 03
  */
public class MockMint extends Mint {

    private static MockMint instance;

    /**
      Creates a new MockMint instance.
      */
    private MockMint() {
    }

    @Override
    public AbstractCoin smeltCoin(double denomination) {
        // we do nothing!
        return NullCoin.getInstance();
    }

    @Override
    public String toString() {
        return "Mock Mint";
    }

    /**
      There is only one MockMint in existence.

      @return the only MockMint.
      */
    public static MockMint getInstance() {
        if (instance == null) {
            instance = new MockMint();
        }
        return instance;
    }
}

