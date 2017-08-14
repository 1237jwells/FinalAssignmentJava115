package chapter.assignments.Chapter9;
import java.util.*;
/**
 * Name: Jordan Wells, Mckay Smith
 * Date: 3/8/2017
 * Program: Assignment9D
 * Description: Comparing 2 dimensional arrays
 * Created by 1237jwells on 3/6/2017.
 */
public class Assignment9D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creates two 3x3 arrays
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        //How to input in two dimensional array
        System.out.print("Enter the values for m1: ");
        for (int x = 0; x < m1.length; x++) {
            for (int y = 0; y < m1[x].length; y++) {
                m1[x][y] = input.nextInt();
            }
        }
        // 2nd two dimensional array
        System.out.print("Enter the values for m2: ");
        for (int x = 0; x < m2.length; x++) {
            for (int y = 0; y < m2[x].length; y++) {
                m2[x][y] = input.nextInt();
            }

        }
        //Calls equals function and states boolean
        if (equals(m1, m2) == true) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }
    // Comparing both arrays tables and finding if equals to
    public static boolean equals(int[][] m1, int[][] m2) {
        for (int x = 0; x < m2.length; x++) {
            for (int y = 0; y < m2[x].length; y++) {

                if (m1 [x][y] != m2[x][y]) {
                    return false;
                }
            }

        }
        return true;
    }
}
