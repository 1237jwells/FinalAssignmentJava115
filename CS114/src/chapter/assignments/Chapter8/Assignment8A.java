package chapter.assignments.Chapter8;
import java.util.Scanner;
import java.util.StringJoiner;
/**
 * Name: Jordan wells, Mckay Smith
 * Date: 2/22/17
 * Program: Assignment8A
 * Description: Converting Kilograms to pounds
 *
 * Created by 1237jwells on 2/22/2017.
 */
public class Assignment8A {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
//validating
        String input;
        do {
            System.out.print("Enter a number between 10 - 100: ");
            input = userInput.nextLine();//user input
        } while (!isInteger(input));
        converting(input);
    }
    public static boolean isInteger(String input) {
        try {
            int temp = Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    private static void converting(String input) {
//formatting
        double result = Integer.parseInt(input);
        double count = 1;
        String dash= new String(new char[45]).replace("\0", "-");
        System.out.printf("%s %13s %2s %10s %10s\n","pounds", "kilograms","|", "kilograms", "pounds");
        System.out.println(dash);
//end loop
        while (result!=0){
//formatting
            double kilo= (count/2.2);
            double pound= (count*2.2);
            System.out.printf("%6.0f %13.3f %2s %10.0f %10.2f\n",count,kilo,"|",count,pound);
            result-=1;
            count+=1;
        }
    }
}
