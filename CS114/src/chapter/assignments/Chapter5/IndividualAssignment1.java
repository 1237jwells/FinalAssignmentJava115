package chapter.assignments.Chapter5;

/**
 * Created by 1237jwells on 1/31/2017.
 */

import java.util.Calendar;
import java.util.Scanner;

public class IndividualAssignment1 {

    public static void main(String args[]) {

        Calendar now = Calendar.getInstance();

        int dateNow  = now.get(Calendar.YEAR);

        //String year = java.lang.LocalDate.now();

        //System.out.println(year);
        Scanner input = new Scanner(System.in);

        System.out.println("What is your current age?");
        int age = input.nextInt();

        System.out.println("At what age would you like to retire?");
        int ageRetire = input.nextInt();
        int yearsLeft = ageRetire-age;

        System.out.println("You have " + yearsLeft + " years left until you can retire.");

        System.out.println("It's " + dateNow + " so you can retire in " + (dateNow+yearsLeft) + ".");


    }
}
