package cs115;

/**
 * Created by icyhot on 6/22/2017.
 */
public class SalaryRange {

    private double min;
    private double max;
    private Currency currency;

    public SalaryRange(double min, double max, Currency currency) {
        this.min = min;
        this.max = max;
        this.currency = currency;
    }
}
