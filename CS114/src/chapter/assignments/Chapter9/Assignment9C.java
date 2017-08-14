package chapter.assignments.Chapter9;
import java.util.Scanner;
/**
 * Name: Mckay Smith, Jordan Wells
 * Date: 3/1/2017
 * Project: Assignment9C
 * Description: Arrays enhanced for loop
 * Created by 1237jwells on 3/1/2017.
 */
public class Assignment9C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare arrays with 100counts
        int[] numbers = new int[100];
        int[] counts = new int[100];
        //Declare counter variable i
        //and temp variable that will
        //temporarily hold the value
        //at a certain index of num[] array
        int count;

        //Temperary value
        int temperary = 0;

        System.out.println("Enter the integers between 1 and 100: ");

        //Initialize num[] array with user input
        for (count = 0; count < numbers.length; count++) {
            numbers[count] = input.nextInt();
            //expe cted input will end when user enters zero
            if (numbers[count] == 0) {
                break;
            }
        }//end of for loop

        //value at a given index of num array
        //will be stored in temp variable
        //temp variable will act as an index value
        //for count array and keep track of number
        //of occurences of each number
        for (count = 0; count < numbers.length; count++) {
            temperary = numbers[count];
            counts[temperary]++;
        }//end of for loop

        for (count = 1; count < counts.length; count++) {

            if (counts[count] > 0 && counts[count] == 1) {
                System.out.printf("%d occurs %d time\n", count, counts[count]);
            } else if (counts[count] >= 2) {
                System.out.printf("%d occurs %d times\n", count, counts[count]);
            }


        }//end of for loop

    }//end of main
}