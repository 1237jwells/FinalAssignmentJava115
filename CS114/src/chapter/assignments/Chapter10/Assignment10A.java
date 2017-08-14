package chapter.assignments.Chapter10;
import java.util.*;
/**
 * Name: Jordan Wells, Cheked Danylo
 * Date: 3/15/17
 * Program: Assignment10A
 * Description: Abecedarian
 * Created by 1237jwell3/15/2017.
 */
public class Assignment10A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User input
        System.out.print("Type your word: ");
        String word = input.nextLine();
        //Run through isAbecedarian method
        if(isAbecedarian(word)){
            System.out.println("Your word is abecedarian");
        }
        else
            System.out.println("Your word is not abecedarian");

    }

    private static boolean isAbecedarian(String word) {
        //check every letter in word
        for(int i=1;i<word.length();i++){
            char letter1 = word.charAt(i-1);
            char letter2 = word.charAt(i);
            //Compare if Abecedarian is true or false
            if(letter1>letter2){
                return false;

            }
        }
        return true;
    }
}
