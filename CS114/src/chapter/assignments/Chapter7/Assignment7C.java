package chapter.assignments.Chapter7;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

/**
 * Program: Assignment7C
 * Name: Jordan Wells, Juan Solis de leon, Stockton Hedges
 * Date: 2/21/2017
 * Description: Use Recursion
 *
 * Created by 1237jwells on 2/17/2017.
 */

//Main method user inputs number and power
public class Assignment7C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input x and n
        System.out.println("Enter x and n: ");
        double number = input.nextDouble();
        int power = input.nextInt();

        //sum of recursion method
        double sum = power(number, power);
        //print recursion method
        System.out.println(sum);
    }

// power method adds recursive equation to inputs
    public static double power(double number, int power) {


// if power equals 0 break recursion
        if (power == 0)
            return 1;
// takes number * number and minus 1 from power;
        double times = number * power(number , power - 1);

        return times;
    }
}

//        ;double times = (number * number);
//        double newPower = (power - 1);
//        double answer = (times * newPower);
//        //if power is 1 or 0 results in varied answers