package chapter.assignments.Chapter6;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by 1237jwells on 2/5/2017.
 */
public class Assignment6A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rndNum = new Random();

        long num1 = rndNum.nextInt((10 - 1) + 1) + 1;
        long num2 = rndNum.nextInt((10 - 1) + 1) + 1;
        long num3 = rndNum.nextInt((10 - 1) + 1) + 1;
        long num4 = rndNum.nextInt((10 - 1) + 1) + 1;

        System.out.println("What is " + num1 + "+"+ num2 + "+" + num3 + "+" + num4 + "?");
        int guess = input.nextInt();
        if (guess == num1+num2+num3+num4) {
            System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + guess + " is True");
        } else {
                System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + guess + " is False");
            }
    }
}
