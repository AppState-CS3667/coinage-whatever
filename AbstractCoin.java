/**
  AbstractCoin

  The base for all Coin types.

  @author team 'whatever'
  @version Nov 03
  */
public abstract class AbstractCoin {

    private double value;
    // change to enum later?
    private String countryCode;
    // int mintingYear;
    // metallic composition later

    /**
      Creates a new AbstractCoin.

      @param value the value of this coin in the local currency
      @param countryCode the country code of this coin, e.g. USD
      */
    public AbstractCoin(double value, String countryCode) {

        // guard against "bad" values

        if (value < 0) {
            throw new IllegalArgumentException("value cannot be negative");
        }

        if (countryCode == null) {
            throw new NullPointerException("countryCode cannot be null");
        }

        this.value = value;
        this.countryCode = countryCode;
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

    @Override
    public String toString() {
        return "["
            + "value=" + this.value + ","
            + "countryCode=" + this.countryCode
            + "]";
    }

}
