package chapter.assignments.Section2;

import java.util.Arrays;

/**
 * Created by 1237jwells on 5/24/2017.
 * Program: Assignment Week 3 - CourseOfferingConflictDetector
 * Name: John Diaz, Jordan Wells
 * Date: 5/31/17
 * Description: - CourseOfferingConflictDetector
 * Instructor: - Bro. Masterson
 */
public class CourseOfferingConflictDetector {

    public boolean isRoomConflict(CourseOffering first, CourseOffering second) {
        if(first.getRoom().equals(second.getRoom())) {
            return true;
        }
        return false;
    }

    public boolean isTimeDayConflict(CourseOffering first, CourseOffering second) {
        if(first.getTime() == second.getTime() && Arrays.equals(first.getDays(), second.getDays())) {
            boolean roomConflict = isRoomConflict(first, second);
            if(roomConflict) {
                System.out.println(first.toString());
                System.out.println(second.toString());
                System.out.println();
            }
            return true;
        }
        return false;
    }
}