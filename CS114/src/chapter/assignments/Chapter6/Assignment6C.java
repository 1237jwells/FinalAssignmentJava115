package chapter.assignments.Chapter6;
import sun.font.TrueTypeFont;

import java.util.Scanner;
/**
 * Created by 1237jwells on 2/5/2017.
 */
public class Assignment6C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Age:");
        int age = input.nextInt();
        System.out.println("Enter Gender:");
        String gender = input.next();
        output(age,gender);
    }

        public static void output(int age,String gender) {

            if (age >= 18 && gender ==("Male")) {
                System.out.println("Priesthood");
            } else if (age >= 12 && gender ==("Male")) {
                System.out.println("Young Men's");
            } else if (age >= 18 && gender == "Female") {
                System.out.println("Relief Society");
            } else if (age >= 12 && gender == "Female") {
                System.out.println("Young Women's");
            } else if (age >= 3) {
                System.out.println("Primary");
            } else if (age >= 1) {
                System.out.println("Nursery");
            } else if (age < 1) {
                System.out.println("Babe in arms");
            }
        }
}