package chapter.assignments.Section1;

/**
 * Created by 1237jwells on 5/14/2017.
 */
public class Assignment1 {
        public static void main(String[] args) {
            ConnectFour cf = new ConnectFour();

            cf.play('X', 0);
            cf.play('X', 0);
            cf.play('X', 0);
            cf.play('X', 0);
            cf.play('X', 0);
            cf.play('X', 0);
            cf.play('X', 1);
            cf.play('X', 1);
            cf.play('X', 1);
            cf.play('X', 1);
            cf.play('X', 1);
            cf.play('X', 1);
            cf.play('X', 2);
            cf.play('X', 2);
            cf.play('X', 2);
            cf.play('X', 2);
            cf.play('X', 2);
            cf.play('X', 2);
            cf.play('X', 3);
            cf.play('X', 3);
            cf.play('X', 3);
            cf.play('X', 3);
            cf.play('X', 3);
            cf.play('X', 3);
            cf.play('X', 4);
            cf.play('X', 4);
            cf.play('X', 4);
            cf.play('X', 4);
            cf.play('X', 4);
            cf.play('X', 4);
            cf.play('X', 5);
            cf.play('X', 5);
            cf.play('X', 5);
            cf.play('X', 5);
            cf.play('X', 5);
            cf.play('X', 5);
            cf.play('X', 6);
            cf.play('X', 6);
            cf.play('X', 6);
            cf.play('X', 6);
            cf.play('X', 6);
            cf.play('X', 6);


            cf.printTable(cf.checkForWinner());


            System.out.println();
        }

//    - $ - - - - -
//    - $ $ - - - -
//    - $ $ $ - - -
//    - $ $ X $ - -
//    - X X X $ $ -
//    $ $ $ X $ X -
//    VResult: $
//    HResult: N
//    DResult: T
//    FINAL RESULT: T



}