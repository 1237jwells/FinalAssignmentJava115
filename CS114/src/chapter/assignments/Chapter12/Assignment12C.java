package chapter.assignments.Chapter12;
import java.util.Scanner;

import java.util.*;

import static chapter.assignments.Chapter12.IntegerSet.get_size;
import static chapter.assignments.Chapter12.IntegerSet.intersection;
import static chapter.assignments.Chapter12.IntegerSet.union;

/**
 *  * Name: Jordan Wells, Cheked Danylo
 * Date: 3/31/17
 * Program Assignment 12C
 * Description: Creating Objects
 * Created by 1237jwells on 3/29/2017.
 */
public class Assignment12C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Creates IntegerSet A
        IntegerSet integerSetA = new IntegerSet();
        //IntegerSet A setting Array
        integerSetA.setArray();
        //Adding integers to array
        integerSetA.add(20);
        integerSetA.add(30);
        integerSetA.add(40);
        integerSetA.add(60);
        integerSetA.toStringArray();
        //removing integers from array
        integerSetA.remove(20);
        integerSetA.remove(30);
        integerSetA.toStringArray();
        System.out.println("20 is in the array: "+integerSetA.isMember(20));
        System.out.println("60 is in the array: "+integerSetA.isMember(60));

        integerSetA.toStringArray();
        //Creates IntegerSetB
        IntegerSet integerSetB = new IntegerSet();
        //IntegerSet B Array
        integerSetB.setArray();
        //Adding integers to Array b
        integerSetB.add(45);
        integerSetB.add(65);
        //union of integerSet A & B
        IntegerSet arrayUnion= new IntegerSet();
        arrayUnion.setArray();
        arrayUnion.union(integerSetA,integerSetB,arrayUnion);
        //intersection of integerSet A and B
        IntegerSet arrayIntersection = new IntegerSet();
        arrayIntersection.setArray();
        integerSetA.add(45);
        arrayIntersection.intersection(integerSetA,integerSetB,arrayIntersection);


    }
}
