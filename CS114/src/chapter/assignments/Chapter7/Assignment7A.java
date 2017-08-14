package chapter.assignments.Chapter7;
import java.util.Scanner;
/**
 * Program: Assignment7A
 * Name: Jordan Wells,juan solis, Stockton Hedges
 * Date: 2/14/17
 * Description: isDivisible function
 * Created by 1237jwells on 2/14/2017.
 */
public class Assignment7A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//gets input
        System.out.print("Enter n, m ");//user info

        int n = input.nextInt() , m = input.nextInt();//user input n & m

        inDivisible(n, m);//call method
    }

    //Find if True or False
    private static void inDivisible(int n, int m) {

        if (n % m == 0) {//function True or False
            System.out.println("True");
        } else {
            System.out.println("False");

        }


    }
}
