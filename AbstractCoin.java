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
    private int mintingYear;
    // metallic composition later

    /**
      Creates a new AbstractCoin.

      @param value the value of this coin in the local currency
      @param countryCode the country code of this coin, e.g. USD
      @param imprintStrategy the strategy for imprinting this coin
      */
    public AbstractCoin(
            double value,
            String countryCode,
            ImprintStrategy imprintStrategy) {

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

        this.value = value;
        this.countryCode = countryCode;
        this.imprintStrategy = imprintStrategy;
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
      Imprints the coin.

      @return true if successful, false otherwise
      */
    public boolean imprint() {
        return this.imprintStrategy.imprint(this);
    }

    @Override
    public String toString() {
        return "["
            + "value=" + this.value + ","
            + "countryCode=" + this.countryCode
            + "]";
    }

}
