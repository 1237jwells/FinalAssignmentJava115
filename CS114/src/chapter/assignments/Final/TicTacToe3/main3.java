package chapter.assignments.Final.TicTacToe3;

/**
 * Created by 1237jwells on 4/10/2017.
 */
public class main3 {

    public static void main(String[] args) {
        System.out.println("O win in the diagonal:");

        // O win in diagonal
        TicTacToe3 a = new TicTacToe3();

        //fill the cell
        System.out.println(a.play(true,1,1));

        System.out.println(a.play(false,0,1));

        System.out.println(a.play(true,2,2));

        System.out.println(a.play(false,1,2));

        System.out.println(a.play(true,0,0));
        System.out.println();

        // call out the result
        System.out.println(a.checkForWinner());

        //output the moves
        System.out.println("moves "+a.getMoveCount()+" times");

        System.out.println("X win is the row:");

        //X win in row

        //TicTacToe3 b = new tictactoe()




    }
}
