package chapter.assignments.Section2;

/**
 * Created by 1237jwells on 5/24/2017.
 * Program: Assignment Week 3 - CourseOfferingConflictDetector
 * Name: John Diaz, Jordan Wells
 * Date: 5/31/17
 * Description: - CourseOfferingConflictDetector
 * Instructor: - Bro. Masterson
 */
public enum EnumDays {

    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday");
    private String name;

    EnumDays(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}