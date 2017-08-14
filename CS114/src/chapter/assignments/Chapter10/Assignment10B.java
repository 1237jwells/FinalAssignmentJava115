package chapter.assignments.Chapter10;
import java.util.*;
/**
 * Name: Jordan Wells, Cheked Danylo
 * Date: 3/15/17
 * Program: Assignment10B
 * Description: areAnagrams
 * Created by 1237jwells on 3/15/2017.
 */
public class Assignment10B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user input
        System.out.print("type 2 Words: ");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        //create array of characters
        char word[] = word1.toCharArray();
        char wordAsArray[] = word2.toCharArray();

//use array and sort it
        if(areAnagrams(word, wordAsArray)){
            System.out.println("Words are anagrams");
        }else System.out.println("Words are not anagrams");
    }
    //Sort the array of characters
    private static boolean areAnagrams(char word[], char wordAsArray[]) {
        Arrays.sort(word);
        Arrays.sort(wordAsArray);

        return Arrays.equals(word,wordAsArray);

        }
    }
