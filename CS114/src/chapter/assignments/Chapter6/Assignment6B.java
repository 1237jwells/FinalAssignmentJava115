package chapter.assignments.Chapter6;
import java.util.Scanner;

/**
 * program: Assignment6B
 * Name: Jordan Wells
 * Date:2/13/2017
 * Description:Converting money
 * Created by 1237jwells on 2/5/2017.
 */
public class Assignment6B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dollar = 1;
        double quarter = .25;
        double dime = .10;
        double nickel = .05;
        double penny = .01;

        System.out.print("Enter an amount ex (3.54):");

        double money = input.nextDouble();
        moneyAmountConverter(money,dollar,quarter,dime,nickel,penny);}

    private static void moneyAmountConverter(double money, int dollar, double quarter, double dime, double nickel, double penny) {

        double remainder = (money % dollar);//how much is left over?
        double quotient = (money - remainder);//how many dollars are in money?
        //Printing Formatted Amounts
        if (quotient<1.0){
            System.out.print("");
        }
        else if (quotient<2.0){
            System.out.println("1    Dollar");
        }
        else if (quotient>2.0){
            int intquotient = (int) quotient;
            System.out.printf(intquotient + "    Dollars\n");
        }

        double remainder2 = (remainder % quarter);
        double quotient2 = (remainder - remainder2);
        if (quotient2 < .25){
            System.out.print("");
        }
        else if (quotient2 < .50) {
            System.out.println("1    Quarters");
        }
        else if (quotient2 < .75) {
            System.out.println("2    Quarters");
        }
        else if (quotient2 < 1) {
            System.out.println("3    Quarter");
        }
        //System.out.println(quotient2 + "   Quarter")}

        double remainder3 = (remainder2 % dime);
        double quotient3 = (remainder2 - remainder3);
        if (quotient3 < .10) {
            System.out.print("");
        }
        else if (quotient3 < .20) {
            System.out.println("1    Dime");
        }
        else if (quotient3 < .30) {
            System.out.println("2    Dimes");
        }
        //System.out.println(quotient3 + "    Dime");

        double remainder4 = (remainder3 % nickel);
        double quotient4 = (remainder3 - remainder4);
        //System.out.println(quotient4 + "    Nickel");
        if (quotient4 < .05) {
            System.out.print("");
        }
        else if (quotient4 < .10) {
            System.out.println("1    Nickel");
        }

        double remainder5 = (remainder4 % penny);
        double quotient5 = (remainder4 - remainder5);
        //System.out.println(quotient5 + "    Penny");
        if (quotient5 < .009) {
            System.out.print("");
        }
        else if (quotient5 < .019) {
            System.out.println("1    Penny");
        }
        else if (quotient5 < .029) {
            System.out.println("2    Pennies");
        }
        else if (quotient5 < .039) {
            System.out.println("3    Pennies");
        }
        else if (quotient5 < .049) {
            System.out.println("4    Pennies");
        }
    }
}