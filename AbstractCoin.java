public abstract class AbstractCoin {

    private double value;
    // change to enum later?
    private String countryCode;
    // int mintingYear;
    // metallic composition later

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

    public double getValue() {
        return value;
    }

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
