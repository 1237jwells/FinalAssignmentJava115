package chapter.assignments.Chapter11;
import java.util.*;
import java.math.BigInteger;
/**
 * Name: Cheked Danylo, Jordan Wells
 * Date: 3/20/2017
 * Program: Big (Assignment11A)
 * Description: factorials 1-30
 * Created by 1237jwells on 3/20/2017.
 */
public class Big {
    public static void main(String[] args) {
        //Calls Factorial method
        factorial();
    }
    private static void factorial() {
        //find factorial of i number
        int fact = 1;
        BigInteger bigFact = BigInteger.valueOf(fact);
        for(int i=1;i<=30;i++){
            BigInteger bigI = BigInteger.valueOf(i);
            BigInteger bigFact2 = bigFact.multiply(bigI);
            System.out.println("Factorial of "+i+ " is "+bigFact2);
            bigFact = bigFact2;
        }
    }
}
