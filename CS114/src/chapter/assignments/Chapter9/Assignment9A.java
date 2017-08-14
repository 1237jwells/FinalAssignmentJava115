package chapter.assignments.Chapter9;
import java.util.Scanner;

/**
 * Names: Mckay Smith, Jordan Wells
 * Date: 2/27/17
 * Project: Assignment9A
 * Description: Find max value inside array
 * Created by 1237jwells on 2/27/2017.
 */
public class Assignment9A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare Variable outside loop
        String listCount1;
        //validate with do/while
        do {
            System.out.println("How many numbers would you like to put in your array? ");
            listCount1 = input.nextLine();
        } while (!isInteger(listCount1));
        int listCount = Integer.parseInt(listCount1);


        //Declaring array
        int[] counts = new int[listCount];

        String userNums;
        //For loop adds values or counts inside array
        for (int i = 0; i < listCount; i++) {
            //Validate do/while
            do {
                System.out.println("Take an array of integers");
                userNums = input.nextLine();


            } while (!isInteger(userNums));
            counts[i] = Integer.parseInt(userNums);
        }

        //answer/output
        System.out.println("The Index number for the Max number is : " + indexOfMax(counts));
    }
    //indexOfMax Method finds the largest value in array
    //needs a array full of integers
    private static int indexOfMax(int[] counts) {
        //Creates the current highest number
        int newNum = counts[0] - 1;
        // replaces newNum with highest number from array
        for (int list : counts) {
            if (list > newNum) {
                newNum = list;

            }
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == newNum) {
                return i;
            }//returns index number of the highest value;
        }
        return -1;
    }

    // Validation Method
    public static boolean isInteger(String listCount) {
        try {
            int temp = Integer.parseInt(listCount);

            if (temp > -1 && temp < 3) ;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}