package chapter.assignments.Chapter9;
import java.util.Scanner;

/**
 * Name: Mckay Smith, Jordan Wells
 * Date: 2/27/17
 * Project: Assignment9B
 * Description Finding factors of n
 * Created by 1237jwells on 2/27/2017.
 */
public class Assignement9B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Number for array length
        System.out.print("How many numbers do you want in the array? ");
        int number = input.nextInt();

        int[] array = new int[number];
        //declare i; range of i; how it counts

        for (int i=0; i<number; i++) {
            System.out.print("Enter numbers in array ");//user info
            array[i] = input.nextInt();
        }
        // factor to use
        System.out.print("What number do you want to factor with? ");
        int factorNum = input.nextInt();

        System.out.println(areFactors(array, factorNum));// print boolean
    }

    //Find if True or False
    private static boolean areFactors(int[] array, int factorNum) {
        for (int i : array) {
            if (i % factorNum != 0) {//function True or False
                return false;
            }
        }
        return true;
        }
    }