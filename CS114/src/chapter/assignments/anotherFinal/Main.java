package chapter.assignments.Final;

import java.util.Scanner;

public class Main {
    /**
     * Honestly, the most that I did was delete and combine and simplify the things you already had
     * because you have a lot of it working already. Most of the stuff I added myself was from this main class.
     * I hope I didn't too much. I was writing another document to explain what you needed to do, but I realized
     * explaining it was going to take too long so I just decided to do it anyways lol
     *
     * Let me give you a hint: focus on getting the play() method in your TicTacToe class to work. Once that is working, then
     * that will make a lot of things in your program work.
     * @param args
     */

    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe(); //I just used ttt to make it shorter haha
        ttt.play(true, 0, 0);
        ttt.play(false, 0, 1);
        ttt.play(true, 1, 0);
        ttt.play(false, 0, 2);
        ttt.play(true, 2, 0);
        System.out.println(ttt.getMoves());
        ttt.board();
        //X has won, because it is three X's in a row in the first column.
        //this is essentially what Masterson wants you to do. you need to hard-code the play() methods
        //so there won't be any user input.

        //should be "char winner", according to assignment description
        boolean winner = ttt.checkForWinner();
        if(winner)
            System.out.println("Someone won"); //prints to screen so that we can see that it works, but it doesn't work right now.





    }
}
