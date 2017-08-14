package chapter.assignments.Chapter5;
import java.util.Scanner;
/**
 * Created by 1237jwells on 1/27/2017.
 */
public class Assignment5A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String day;
        int date;
        String month;
        int year;

        System.out.print("Enter the day of the week: ");
        day = input.next();

        System.out.print("Enter the date of the month: ");
        date = input.nextInt();

        System.out.print("Enter the Month: ");
        month = input.next();

        System.out.print("Enter the year: ");
        year = input.nextInt();

        lineSpace();
        //Calling the methods
        printAmerican(day, date, month, year); //prints the date in American format
        lineSpace();

        printEuropean(day, date, month, year); //prints the date in European format
        lineSpace();



    }

    public static void printAmerican(String day, int date, String month, int year){
        //Formatting American Date Format
        System.out.println("American format: ");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month + " ");
        System.out.print(date + ", ");
        System.out.println(year);
    }

    public static void printEuropean(String day, int date, String month, int year){
        //Formatting European Date Format
        System.out.println("European format: ");
        System.out.print(day + " ");
        System.out.print(date + " ");
        System.out.print(month + " ");
        System.out.print(year);
    }

    public static void lineSpace() {
        System.out.println();
    }
}

