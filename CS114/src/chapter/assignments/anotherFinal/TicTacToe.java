package chapter.assignments.Final;
import java.util.Scanner;

/**
 * Created by 1237jwells on 4/3/2017.
 */
public class TicTacToe {
    //create empty board;
    private char[][] playBoard;
    private int moves;

    public TicTacToe () {
        playBoard = new char[3][3];
        //create Rows and Columns for TicTacBoard
        // Board rows
        for (int row = 0; row < 3; row++) {

            //Board columns
            for (int col = 0; col < 3; col++) {
                playBoard[row][col] = '-';

            }
        }
    }

    public void board() {
        //Formatting TicTacBoard
        System.out.print("------------\n");

        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(playBoard[row][col] + " | ");
            }
            System.out.println();

        }
        System.out.print("------------");
    }

    /**
     * If the spot == '-', then it is available, and you can fill it with X or O
     * Else, return false, because that means X or O is in that spot
     * @param isX
     * @param row
     * @param col
     * @return
     */
    public boolean play(boolean isX, int row, int col) {
        if(playBoard[row][col] == '-') {
            //now you need another if statement in here. if "isX" is true, then put X into the coordinates. Else you will put O.
            //once you get that line of code, your program is on its way :)
            //increase the "private int moves" variable by 1
            return true;
        }
        return false;
    }

    public int getMoves() {
        return moves;
    }


        // Returns true if there is a win, false otherwise.
        // This calls our other win check functions to check the entire board.
        public boolean checkForWinner() {
            return (rowsWin() || columnsWin() || diagonalsWin());
        }


        // Loop through rows and see if any are winners.
        private boolean rowsWin() {
            for (int i = 0; i < 3; i++) {
                if (rowCol(playBoard[i][0], playBoard[i][1], playBoard[i][2]) == true) {
                    return true;
                }
            }
            return false;
        }


        // Loop through columns and see if any are winners.
        private boolean columnsWin() {
            for (int i = 0; i < 3; i++) {
                if (rowCol(playBoard[0][i], playBoard[1][i], playBoard[2][i]) == true) {
                    return true;
                }
            }
            return false;
        }
        // Check the two diagonals to see if either is a win. Return true if either wins.
        private boolean diagonalsWin() {
            return ((rowCol(playBoard[0][0], playBoard[1][1], playBoard[2][2]) == true) || (rowCol(playBoard[0][2], playBoard[1][1], playBoard[2][0]) == true));
        }


        // Check to see if all three values are the same (and not empty) indicating a win.
        private boolean rowCol(char c1, char c2, char c3) {
            return ((c1 != '-') && (c1 == c2) && (c2 == c3));
        }
    }










//public char[][] resetBoard = new boolean[e];
//    public void setResetBoard() {
//        for (int i = 0; i < e; i++) {
//            resetBoard[i] = e;
//        }
//    }
//
//
//
//public boolean play(){
//
//    return true;
//    //bool validPlay= TicTacToeObject.play(true,2,1);
//}
//
//public void getMoves(){
//    //int moves = TicTacToeObject.getMoves();
//}
//
//public void checkForWinner(){
//    //char winner = TicTacToeObject.checkForWinner();
//}
//
//
//
//
//}