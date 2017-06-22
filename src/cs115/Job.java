package cs115;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by icyhot on 6/22/2017.
 */
public class Job {

    private Person employee;
    private Person supervisor;
    private SalaryRange salaryRange;
    private ArrayList<String> duties = new ArrayList<>();
    private String jobTitle;

    public Job(double min, double max, Currency currency) {
        salaryRange = new SalaryRange(min, max, currency);
    }
}
