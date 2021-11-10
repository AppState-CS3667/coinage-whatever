/**
  AbstractCoin

  The base for all Coin types.

  @author team 'whatever'
  @version Nov 03
  */
public abstract class AbstractCoin {

    private double value;
    private String countryCode;
    private ImprintStrategy imprintStrategy;
    private SmeltStrategy smeltStrategy;
    private int mintingYear;
    // metallic composition later

    private boolean smelted = false;
    private boolean imprinted = false;

    /**
      Creates a new AbstractCoin.

      @param value the value of this coin in the local currency
      @param countryCode the country code of this coin, e.g. USD
      @param imprintStrategy the strategy for imprinting this coin
      @param smeltStrategy the strategy for smelting this coin
      */
    public AbstractCoin(
            double value,
            String countryCode,
            ImprintStrategy imprintStrategy,
            SmeltStrategy smeltStrategy) {

        // guard against "bad" values

        if (value < 0) {
            throw new IllegalArgumentException("value cannot be negative");
        }

        if (countryCode == null) {
            throw new NullPointerException("countryCode cannot be null");
        }

        if (imprintStrategy == null) {
            throw new NullPointerException("imprintStrategy cannot be null");
        }

        if (smeltStrategy == null) {
            throw new NullPointerException("smeltStrategy cannot be null"); 
        }

        this.value = value;
        this.countryCode = countryCode;
        this.imprintStrategy = imprintStrategy;
        this.smeltStrategy = smeltStrategy;
        this.mintingYear = DateHelper.getYear();
    }

    /**
      Returns the value of this coin in the local currency.
      
      @return the value
      */
    public double getValue() {
        return value;
    }

    /**
      Returns the country code of this coin (never null).

      @return the code
      */
    public String getCountryCode() {
        return countryCode;
    }

    /**
      Returns the minting year of this coin.

      @return the current year
      */
    public int getMintingYear() {
        return this.mintingYear;
    }

    /**
      Returns the smelt specs of this coin.

      @return the smelt specs
      */
    public String getSmeltSpecs() {
        return this.smeltStrategy.getSmeltSpecs();
    }

    /**
      Imprints the coin.

      @return true if successful, false otherwise
      */
    public boolean imprint() {
        if (this.imprinted) {
            throw new IllegalStateException("Already imprinted");
        }
        boolean success = this.imprintStrategy.imprint(this);
        if (success) {
            this.imprinted = true;
        }
        return success;
    }

    /**
      Smelts the coin.

      @return true if successful, false otherwise
      */
    public boolean smelt() {
        if (this.smelted) {
            throw new IllegalStateException("Already smelted");
        }
        boolean success = this.smeltStrategy.smelt(this);
        if (success) {
            this.smelted = true;
        }
        return success;
    }

    @Override
    public String toString() {
        return "["
            + "value=" + this.value + ","
            + "countryCode=" + this.countryCode
            + "]";
    }

}
