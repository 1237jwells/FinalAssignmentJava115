package chapter.assignments.Section2;

import java.time.LocalTime;
import javax.management.DynamicMBean;

/**
 * Created by 1237jwells on 5/24/2017.
 * Program: Assignment Week 3 - CourseOfferingConflictDetector
 * Name: John Diaz, Jordan Wells
 * Date: 5/31/17
 * Description: - CourseOfferingConflictDetector
 * Instructor: - Bro. Masterson
 */
public class CourseOffering {
    private int courseNumber;
    private String courseName;
    private String instructor;
    private char section;
    private String room;
    private LocalTime time;
    private EnumDays days[];
    private int capacity;

    public CourseOffering(int courseNumber, String courseName, String instructor,
                          char section, String room, LocalTime time, int days, int capacity) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.instructor = instructor;
        this.section = section;
        this.room = room;
        this.time = time;
        this.days = new EnumDays[days];
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        String course = String.format("%s, Room %s, %s", courseName, room, time.toString());
        return course;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public EnumDays[] getDays() {
        return days;
    }

    public void setDays(EnumDays[] days) {

    }
}