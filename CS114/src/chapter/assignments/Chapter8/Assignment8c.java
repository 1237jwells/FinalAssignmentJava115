package chapter.assignments.Chapter8;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by mckaysmith on 2/13/2017.
 */
public class Assignment8c {

        public static void main(String[] args) {
            //declaring variable
            Scanner input = new Scanner(System.in);
            Random rndNum = new Random();
            String userNum;

            //assign scores
            int comScore = 0;
            int userScore = 0;

            //Start of while loop
            while (true) {

                //if on score if 3 more then the other break loop
                if (comScore == userScore + 3){
                    break;
                } else if (userScore == comScore + 3){
                    break;
                }

                //gernate computers number
                int comNum = rndNum.nextInt(3);

                //validate uare input
                do {
                System.out.print("Scissor (0), Rock(1), Paper(2): ");

                userNum = input.nextLine();
                }while(!isInteger(userNum));

                //play rock paper scissors
                int score = findWinner(comNum, userNum);

                // if score == 0(computer wins)
                // if score == 1(user wins)
                if (score == 0) {
                    comScore += 1;
                    System.out.println("Your Score: " + userScore + " Computer's Score: " + comScore + "\n");
                } else if (score == 1) {
                    userScore += 1;
                    System.out.println("Your Score: " + userScore + " Computer's Score: " + comScore + "\n");
                } else {
                    System.out.println("Your Score: " + userScore + " Computer's Score: " + comScore + "\n");
                }
            }

            if (comScore > userScore){
                System.out.println("Computer wins");
            } else {
                System.out.println("You win");

            }
        }

        public static int findWinner(int comNum, String userNum1){
            int userNum = Integer.parseInt(userNum1);

            String comType = "";
            String userType = "";

            // switch number into text
            switch (comNum) {
                case 0:  comType = "scissor";
                    break;
                case 1:  comType = "rock";
                    break;
                case 2:  comType = "paper";
                    break;
            }
            switch (userNum) {
                case 0:  userType = "scissor";
                    break;
                case 1:  userType = "rock";
                    break;
                case 2:  userType = "paper";
                    break;
            }

            //find the winner if there is no scissors
            if (comNum == userNum){
                System.out.println("The computer is " + comType +". You are "+ userType + ". It is a draw.");
                return 2;
            }

            else if (comNum != 0 && userNum != 0) {
                if (userNum > comNum) {
                    System.out.println("The computer is " + comType + ". You are " + userType + ". You won.");
                    return 1;
                } else {
                    System.out.println("The computer is " + comType + ". You are " + userType + ". You lost.");
                    return 0;

                }
            }

            //find the winner if there is no rock
            else if (comNum != 1 && userNum != 1) {
                if (userNum < comNum) {
                    System.out.println("The computer is " + comType + ". You are " + userType + ". You won.");
                    return 1;
                } else {
                    System.out.println("The computer is " + comType + ". You are " + userType + ". You lost.");
                    return 0;
                }
            }

            //find the winner if there is no paper
            else if (comNum != 2 && userNum != 2) {
                if (userNum > comNum) {
                    System.out.println("The computer is " + comType + ". You are " + userType + ". You won.");

                    return 1;
                } else {
                    System.out.println("The computer is " + comType + ". You are " + userType + ". You lost.");

                    return 0;

                }
            }
            return 3;
        }

        public static boolean isInteger(String input) {
            try{

                int temp = Integer.parseInt(input);
                if (temp > -1 && temp < 3) {
                    return true;
                } else {
                    return false;
                }
            }
            catch (Exception e){
                return false;
        }
    }
}
