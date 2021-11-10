/**
  CADNickelCoin

  CAD coin with value of 0.05.

  @author edwardscm6
  @version Nov. 5
  */
public class CADNickelCoin extends AbstractCoin {
    /** Constructor for a new CADNickelCoin type. */
    public CADNickelCoin() {
        // Call to super to create coin
        super(0.05, "CAD", new CADNickelCoinImprint());
    }
}
