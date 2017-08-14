package chapter.assignments.Chapter7;
import java.util.Scanner;
/**
 * Program: Assignment7B
 * Name: Jordan Wells, Juan Solis de leon, Stockton Hedges
 * Date: 2/15/2017
 * Description: Find largest of three numbers with validation
 *
 * Created by 1237jwells on 2/14/2017.
 */
public class Assignment7B {
    public static void main(String[] args) {
        //
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int x = 1;

        do {

            try {
                Scanner input = new Scanner(System.in);//gets input
                System.out.print("Enter three numbers: ");
                num1 = input.nextInt();//get 3 numbers from user
                num2 = input.nextInt();
                num3 = input.nextInt();
                x = 2;

            } catch (Exception e) {
                System.out.println("Enter three numbers that are integers");

            }


        }    while (x == 1) ;

        maxNum(num1,num2,num3);

    }
    private static void maxNum(int num1, int num2, int num3) {//Finding Largest #
        if (num1 > num2 && num1 > num3){
            System.out.println("Largest number is " + num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("Largest number is " + num2);
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println("Largest number is " + num3);
        }
    }
}
