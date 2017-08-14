package chapter.assignments.Final.TicTacToe2;
/**
 *Name: Jordan Wells
 * Date: 4/10/2017
 * Assignment: Final Code
 * Description: TicTacToe Game
 * Created by 1237jwells on 4/10/2017.
 */
public class  TicTacToe2 {
    //create empty board;
    private char[][] playBoard;
    private int moves;
    private boolean role;
    public TicTacToe2() {
        playBoard = new char[3][3];
        //create Rows and Columns for TicTacBoard
        //Board rows
        for (int row = 0; row < 3; row++)
            //Board columns
            for (int col = 0; col < 3; col++)
                playBoard[row][col] = 0;
        //role true = x ; role false = o
        role = true;
        //player moves at 0
        moves = 0;
    }
    public boolean play(boolean isX, int row, int col) {
        //check for errors
        //if player didnt change
            if (role != isX) {
                System.out.println("It didn't change the player.");
                return false;
            }
            //if row's or col's are full
            if (row > 2 || col > 2) {
                return false;
            }
            //if cell is full already
            int test = playBoard[row][col];
            if (test != 0) {
                System.out.println("Cell is not empty!!!");
                return false;
            }
            //if "isX" is true, then put X into the coordinates. Else you will put O.
            //input the o and x and change the player
            if ( role == false) {
                playBoard[row][col] = 'o';
                role = true;
            } else {
                playBoard[row][col] = 'x';
                role = false;
            }
            //add the moves
            moves++;
            return true;
    }
    //checkForWinner
    public char checkForWinner() {
        char winner = 'N';
        //check the row
        for (int row = 0; row < playBoard.length; row++) {
            if (playBoard[row][0] == playBoard[row][1] && playBoard[row][1] == playBoard[row][2] && (playBoard[row][0] == 'o')) {
                winner = 'o';
            }
            if (playBoard[row][0] == playBoard[row][1] && playBoard[row][1] == playBoard[row][2] && (playBoard[row][0] == 'x')) {
                winner = 'x';
            }
        }
        //check the column
        for (int col = 0; col < playBoard.length; col++) {
            if (playBoard[0][col] == playBoard[1][col] && playBoard[1][col] == playBoard[2][col] && (playBoard[0][col] == 'o')) {
                winner = 'o';
            }
            if (playBoard[0][col] == playBoard[1][col] && playBoard[1][col] == playBoard[2][col] && (playBoard[0][col] == 'x')) {
                winner = 'x';
            }
        }
        //check two diagonals
        if (playBoard[2][0] == playBoard[1][1] && playBoard[1][1] == playBoard[0][2] && (playBoard[2][0] == 'o')){
            winner = 'o';
        }
        if (playBoard[2][0] == playBoard[1][1] && playBoard[1][1] == playBoard[0][2] && (playBoard[2][0] == 'x')){
            winner = 'x';
        }
        if (playBoard[0][0] == playBoard[1][1] && playBoard[1][1] == playBoard[2][2] && (playBoard[2][2] == 'o')){
            winner = 'o';
        }
        if (playBoard[0][0] == playBoard[1][1] && playBoard[1][1] == playBoard[2][2] && (playBoard[2][2] == 'x')){
            winner = 'x';
        }
        //check if it's a draw
        if (moves == 9) {
            winner = 'T';
        }
        return winner;
    }
    //check moves
    public int getMoves() {
        return moves;
    }
}