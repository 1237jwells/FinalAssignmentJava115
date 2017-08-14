package chapter.assignments.Section2;

import java.time.LocalTime;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by 1237jwells on 5/24/2017.
 * Program: Assignment Week 3 - CourseOfferingConflictDetector
 * Name: John Diaz, Jordan Wells
 * Date: 5/31/17
 * Description: - CourseOfferingConflictDetector
 * Instructor: - Bro. Masterson
 */
public class CourseOfferingConflictDetectorTest {
        @org.junit.Test
        public void isRoomConflict() throws Exception {
            CourseOfferingConflictDetector detector = new CourseOfferingConflictDetector();
            CourseOffering co1 = new CourseOffering(12345, "Algebra", "Spencer", 'A', "101", LocalTime.MIDNIGHT, 2, 100);
            CourseOffering co2 = new CourseOffering(54321, "History", "Anderson", 'B', "101", LocalTime.NOON, 1, 100);
            boolean shouldBeTrue = detector.isRoomConflict(co1, co2);
            assertTrue("There should be a room conflict", shouldBeTrue);

            CourseOffering co3 = new CourseOffering(54321, "History", "Anderson", 'B', "555", LocalTime.NOON, 1, 100);
            boolean shouldBeFalse = detector.isRoomConflict(co2, co3);
            assertFalse("There should not be a room conflict", shouldBeFalse);
        }

        @org.junit.Test
        public void isTimeDayConflict() throws Exception {
            CourseOfferingConflictDetector detector = new CourseOfferingConflictDetector();

            CourseOffering co1 = new CourseOffering(12345, "Algebra", "Spencer", 'A', "101", LocalTime.NOON, 2, 100);
            CourseOffering co2 = new CourseOffering(54321, "History", "Anderson", 'B', "101", LocalTime.NOON, 2, 100);
            EnumDays[] days1 = new EnumDays[2];
            days1[0] = EnumDays.MONDAY;
            days1[1] = EnumDays.WEDNESDAY;
            co1.setDays(days1);

            EnumDays[] days2 = new EnumDays[2];
            days2[0] = EnumDays.MONDAY;
            days2[1] = EnumDays.WEDNESDAY;
            co2.setDays(days2);

            boolean shouldBeTrue = detector.isTimeDayConflict(co1, co2);
            assertTrue("There should be a TimeDay conflict", shouldBeTrue);

            CourseOffering co3 = new CourseOffering(54321, "History", "Anderson", 'B', "101", LocalTime.MIDNIGHT, 2, 100);

        }

    }