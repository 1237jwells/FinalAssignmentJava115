package chapter.assignments.Chapter12;
import java.util.*;
/**
 * Created by 1237jwells on 3/29/2017.
 */
public class Coins {
    private double dollars;
    private double quarters;
    private double dimes;
    private double nickels;
    private double pennies;

    //create coins that is initially empty
    public Coins() {
        quarters = 0;
        dimes = 0;
        nickels = 0;
        pennies = 0;
    }
public String toString(){
        return String.format("%.2f\n",this.dollars);
}
public boolean equals(Coins that){
    return this.dollars == that.dollars;
}
    //Create coins that initially has values
    public Coins(double dollars) {
        this.dollars = dollars;
        this.quarters = (dollars/.25);
        this.dimes = (dollars/.1);
        this.nickels = (dollars/.05);
        this.pennies = (dollars/.01);
    }

    public Double totalDollars(Coins this){
        return(this.dollars);
    }
    public Double totalQuarters(Coins this){
        return(this.quarters);
    }public Double totalDimes(Coins this){
        return(this.dimes);
    }public Double totalNickels(Coins this){
        return(this.nickels);
    }public Double totalPennies(Coins this){
        return(this.pennies);
    }
}

