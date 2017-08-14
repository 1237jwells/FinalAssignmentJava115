package chapter.assignments.Chapter4;

import java.util.Scanner;

/**
 * Created by 1237jwells on 1/23/2017.
 */
public class Assignment4B {
    public static void main(String[] args){



        double monthlySavingsAmount;
        double monthlyInterestRate;
        double yearlyInterestRate;
        double month1;
        double month2;
        double month3;
        double month4;
        double month5;
        double month6;

        Scanner in = new Scanner (System.in);

        System.out.print("Enter the monthly savings amount: ");
        monthlySavingsAmount = in.nextDouble();

        System.out.print("Enter the yearly interest rate: ");
        yearlyInterestRate = (in.nextDouble() * .01);

        monthlyInterestRate = (yearlyInterestRate /12);

        month1 = (monthlySavingsAmount * monthlyInterestRate) + monthlySavingsAmount;
        System.out.println(month1);

        month2 = ((month1 + monthlySavingsAmount) * monthlyInterestRate) + (month1 + monthlySavingsAmount);
        System.out.println(month2);
        month3 = ((month2 + monthlySavingsAmount) * monthlyInterestRate) + (month2 + monthlySavingsAmount);
        System.out.println(month3);
        month4 = ((month3 + monthlySavingsAmount) * monthlyInterestRate) + (month3 + monthlySavingsAmount);
        System.out.println(month4);
        month5 = ((month4 + monthlySavingsAmount) * monthlyInterestRate) + (month4 + monthlySavingsAmount);
        System.out.println(month5);
        month6 = ((month5 + monthlySavingsAmount) * monthlyInterestRate) + (month5 + monthlySavingsAmount);
        System.out.println(month6);
        System.out.print("After 6 month's your balance is: " + month6);


    }
}
