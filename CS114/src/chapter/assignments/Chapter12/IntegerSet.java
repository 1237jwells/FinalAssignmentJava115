package chapter.assignments.Chapter12;
import java.util.Scanner;


/**
 * Name: Jordan Wells, Cheked Danylo
 * Date: 3/31/17
 * Program Assignment 12C
 * Description: Creating Objects
 * Created by 1237jwells on 3/31/2017.
 */
public class IntegerSet {
    //Object that holds range 0-100
    public static int get_size = 101;//[0-100]

    //Array and get size
    public boolean[] booleanArray = new boolean[get_size];
    public void setArray() {
        for (int i = 0; i < get_size; i++) {
            booleanArray[i] = false;
        }
    }
public void printArray(){
        //printsArray
    for (int i = 0; i < get_size; i++) {
        System.out.println(i+": "+booleanArray[i]);
    }

}

    public static void union(IntegerSet setA, IntegerSet setB, IntegerSet union) {
    //Combining Elements from IntegerSet A & B
        for (int i = 0; i < get_size; i++) {
            if (setB.booleanArray[i]) {
                union.booleanArray[i] = true;
            }
            if (setA.booleanArray[i]) {
                union.booleanArray[i] = true;
            }
        }
    }
    public static void intersection(IntegerSet setA, IntegerSet setB, IntegerSet arrayIntersection) {
    //Combining Elements from IntegerSet A & B if both are found in integerSet A & B
        for (int i = 0; i < get_size; i++) {
            if (setB.booleanArray[i]==true && setA.booleanArray[i] == true) {
                arrayIntersection.booleanArray[i] = true;
            }
        }

    }
    //Adding element to array

    public void add(int element) {
        booleanArray[element] = true;
    }

    //Removing element to array

    public void remove(int element) {
        booleanArray[element] = false;
    }

    public void toStringArray() {
    // converting element in array to string
    int count = 0;
        String foo = "";
        for (int i = 0; i < get_size; i++) {
            if (booleanArray[i]==true){

                if (i!=get_size){
                    foo += Integer.toString(i) + ", ";
                }
            }
        }
        foo = foo.substring(0, foo.length() - 2);
        System.out.print(foo);
        System.out.println();
    }

    public boolean isMember(int b) {
    //Returns true or false depending if it is in the IntegerSet or not
        if(booleanArray[b]==true){
            return true;
        }
            return false;
        }
    }
