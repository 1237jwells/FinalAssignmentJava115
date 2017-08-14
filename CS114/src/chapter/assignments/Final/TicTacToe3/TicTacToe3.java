package chapter.assignments.Final.TicTacToe3;

/**
 * Created by 1237jwells on 4/10/2017.
 */
public class TicTacToe3 {
    private int moveCount;
    private int row, col;
    private char[][] board = new char[3][3];
    private boolean role;
    char winner = 'N';

    public TicTacToe3() {
        char[][] board = new char[3][3];
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                board[row][col] = 0;
        moveCount = 0;

        //role true = o ; role false = x
        role = true;

    }

    //test the input
    public boolean play(boolean n, int i, int j) {


        //test if it is the right player
        if (role != n) {
            System.out.println("Didn't change the player.");
            return false;
        }

        if (i > 2 || j > 2) {
            return false;
        }

        //test if the array is empty
        int test = board[i][j];
        if (test != 0) {
            System.out.println("That cell is not empty!!!");
            return false;
        }

        //input the o and x and change the player
        if (role == true) {
            board[i][j] = 'O';
            role = false;
        } else {
            board[i][j] = 'X';
            role = true;
        }

        //add the moves
        moveCount++;
        return true;
    }


    //check the victory
    public char checkForWinner() {


        // check the row
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && (board[row][0] == 'o')) {
                winner = 'o';
            }
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && (board[row][0] == 'x')) {
                winner = 'x';
            }
        }

        //check the column
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && (board[0][col] == 'o')) {
                winner = 'o';
            }
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && (board[0][col] == 'x')) {
                winner = 'x';
            }
        }

        // check two diagonals
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && (board[2][0] == 'o'))
            winner = 'o';
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && (board[2][0] == 'x'))
            winner = 'x';

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && (board[2][2] == 'o'))
            winner = 'o';
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && (board[2][2] == 'x'))
            winner = 'x';


            // check if it's a draw
        else if (moveCount == 9) {
            winner = 'T';
        }
        return winner;
    }

    // get the moves
    public int getMoveCount(){ return moveCount; }



    }