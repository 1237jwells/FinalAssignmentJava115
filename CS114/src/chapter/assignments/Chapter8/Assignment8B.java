package chapter.assignments.Chapter8;

import java.util.Random;
import java.util.Scanner;

/**
 * Name: Jordan Wells
 *
 * Created by 1237jwells on 2/22/2017.
 */
public class Assignment8B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//gets input
        Random Ran = new Random();//Computer Generated number 0-2
        int score = 0;
        String guess;
        ///validating
        while(true) {
            if (score == 3 || score == -3)break;
            int computer = Ran.nextInt(3 - 0);

            do {
                System.out.print("Scissor(0), Rock(1), Paper(2): ");// User options
                guess = input.nextLine();//User's guess
            } while (!isInteger(guess));
            int points = switchMethod(guess , computer );
            if (points == 0) {
                score -= 1;
            }else if (points==1){
                score +=1;
                }
            }
        if (score == -3) {
            System.out.println("Computer Wins");
        }
        else{
            System.out.println("You Win");
        }
    }
            public static boolean isInteger(String input) {
                try {
                    int temp = Integer.parseInt(input);
                    if (temp > -1 && temp < 3);
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }

    // switchMethod - Results of Rock Paper Scissors game
    private static int switchMethod(String guess1, int computer) {
        int guess = Integer.parseInt(guess1);


        switch (guess) {
            case 0:// results if you use 0 or Scissors
                if (computer==0){
                    System.out.println("The Computer is Scissors. You are Scissors It is a draw.");
                    return 2;}
                else if (computer==1) {
                    System.out.println("The Computer is Rock. You are Scissors. You Lost.");
                    return 0;}
                else if (computer==2) {
                    System.out.println("The Computer is Paper. You are Scissors. You Won.");
                    return 1;}
                break;
            case 1:// results if you use 1 or Rock
                if (computer==0) {
                    System.out.println("The Computer is Scissors. You are Rock. You Won.");
                    return 1;}
                else if (computer==1) {
                    System.out.println("The Computer is Rock. You are Rock. It is a draw.");
                    return 2;}
                else if (computer==2) {
                    System.out.println("The Computer is Paper. You are Rock. You Lost.");
                    return 0;}
                break;
            case 2:// results if you use 2 or Paper
                if (computer==0) {
                    System.out.println("The Computer is Scissors. You are Paper. You Lost.");
                    return 0;}
                else if (computer==1) {
                    System.out.println("The Computer is Rock. You are Paper. You Won.");
                    return 1;}
                else if (computer==2) {
                    System.out.println("The Computer is Paper. You are Paper. It is a draw.");
                    return 2;}
                break;
            default:
                break;
        }
        return 2;
    }


}
