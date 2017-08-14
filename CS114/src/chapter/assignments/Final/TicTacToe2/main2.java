package chapter.assignments.Final.TicTacToe2;

/**
 *Name: Jordan Wells
 * Date: 4/10/2017
 * Assignment: Final Code
 * Description: TicTacToe Game
 * Created by 1237jwells on 4/10/2017.
 */

public class main2{

    public static void main(String[] args) {
        TicTacToe2 ttt = new TicTacToe2(); //I just used ttt to make it shorter haha
        //Player's Moves
        ttt.play(true, 0, 0);
        ttt.play(false, 0, 1);
        ttt.play(true, 1, 1);
        ttt.play(false, 0, 2);
        ttt.play(true, 2, 2);
        //Check for winner
        if (ttt.checkForWinner()!='N')
            System.out.println("Player "+ ttt.checkForWinner() + " is the winner");
        //Check how many moves were on the TicTacToe Board
        System.out.println("There are "+ ttt.getMoves()+" Moves on this TicTacToe Board");}
}

