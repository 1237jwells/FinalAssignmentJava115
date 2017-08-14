package chapter.assignments.Chapter5;
import java.util.Scanner;
/**
 * Created by 1237jwells on 2/3/2017.
 */
public class Assignment5B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a time offset: ");
        int offset = input.nextInt();
        printTimeWithOffSet(offset);
    }


    public static void printTimeWithOffSet(int offset) {
        System.out.println();
        long time = System.currentTimeMillis();
        long secs = time/1000; // find secs
        long mins = secs/60;
        long hours = mins/60;
        secs = secs%60;
        mins = mins%60;
        hours = hours%24;
        hours = hours + offset;

        System.out.printf("%d:%02d:%02d",hours, mins,secs);
        //System.out.printf(t/T)


        //long passedTime = System.currentTimeMillis();
        //long offsetMillis = passedTime + (offset * 3600000);

    }

}
