package chapter.assignments.Chapter6;
import java.util.Scanner;
import java.util.Random;
/**
 * program: Assignment6D
 * Name: Jordan Wells, Juan Solis, Stockton Hedges
 * Date:2/13/2017
 * Description: Rock, Paper, Scissors
 * * Created by 1237jwells on 2/5/2017.
 */
public class Assignment6D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//gets input

        Random Ran = new Random();//Computer Generated number 0-2
        int computer = Ran.nextInt(3 - 0);

        System.out.print("Scissor(0), Rock(1), Paper(2): ");// User options
        int guess = input.nextInt();//User's guess

        switchMethod(guess,computer);
    }// switchMethod - Results of Rock Paper Scissors game
        private static void switchMethod(int guess, int computer) {

        switch (guess) {
            case 0:// results if you use 0 or Scissors
                if (computer==0)
                System.out.println("The Computer is Scissors. You are Scissors It is a draw.");
                else if (computer==1)
                    System.out.println("The Computer is Rock. You are Scissors. You Lost.");
                else if (computer==2)
                    System.out.println("The Computer is Paper. You are Scissors. You Won.");
                break;
            case 1:// results if you use 1 or Rock
                if (computer==0)
                System.out.println("The Computer is Scissors. You are Rock. You Won.");
                else if (computer==1)
                    System.out.println("The Computer is Rock. You are Rock. It is a draw.");
                else if (computer==2)
                    System.out.println("The Computer is Paper. You are Rock. You Lost.");
                break;
            case 2:// results if you use 2 or Paper
                if (computer==0)
                System.out.println("The Computer is Scissors. You are Paper. You Lost.");
                else if (computer==1)
                    System.out.println("The Computer is Rock. You are Paper. You Won.");
                else if (computer==2)
                    System.out.println("The Computer is Paper. You are Paper. It is a draw.");
                break;
            default:
                break;
        }
    }


}
