package chapter.assignments.Chapter12;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
/**
 * Name: Checked Danylo, Jordan Wells
 * Date: 3/29/17
 * Program: Assignment 12B
 * Description: Creating Objects
 * Created by 1237jwells on 3/26/2017.
 */
public class Assignment12B {
    public static void main(String[] args) {

        //Jazz Sports Team
        Coins money = new Coins(2.43);
        //toString method
        String t = money.toString();
        System.out.print(t);
        //Return in Dollars
        System.out.print("$");
        System.out.printf("%.2f\n",money.totalDollars());
        //Return in Quarters, Dimes, Nickels, Pennies
        System.out.printf("Quarters: %.0f\n",money.totalQuarters());
        System.out.printf("Dimes: %.0f\n",money.totalDimes());
        System.out.printf("Nickels: %.0f\n",money.totalNickels());
        System.out.printf("Pennies: %.0f\n",money.totalPennies());

        //Create new Coin
        Coins dinero = new Coins(1.0);
        //Compares Coin one and Coin two

        System.out.println(money.equals(dinero));
    }
}
