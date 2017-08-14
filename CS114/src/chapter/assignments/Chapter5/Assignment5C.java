package chapter.assignments.Chapter5;

/**
 * Created by 1237jwells on 1/30/2017.
 */

import java.util.Scanner;

public class Assignment5C {

    //public static void

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many snarks to start with?");
        int startingSnarks = input.nextInt();
        System.out.println(startingSnarks);
        snark(startingSnarks);
    }

    public static void snark(int numSnarks) {
        numSnarks++;
        System.out.println(numSnarks);
        moreSnarks(numSnarks);
    }
    public static void moreSnarks(int multiSnarks) {

        multiSnarks = (multiSnarks+10);
        System.out.println(multiSnarks);
        powerSnarks(multiSnarks);
    }
    public static void powerSnarks(int lotsOfSnarks) {
        lotsOfSnarks = (int)Math.pow(lotsOfSnarks, 5);
        System.out.println(lotsOfSnarks);
    }

}

