package DateAndTime.New_Date_Time;

import java.time.LocalDate;
import java.time.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Makes instance of a class with the specified input
 * <li>a temporal object is an instance of a class that represents a point in time or a unit of time. These objects are part of the java.time.temporal package and implement the Temporal interface.</li>
 * <br> Most of the objects we create in the New Date-Time API are immutable.
 */
public class OfDemo {
    public static void main(String[] args) {
//        Same for the other classes
        LocalDate date = LocalDate.of(2015, 3, 18);
        LocalDate date1 = LocalDate.of(2091, Month.FEBRUARY, 28);
        System.out.println(date);
        System.out.println(date1);
        LocalTime time = LocalTime.of(14, 30);
        LocalDateTime dateTime = LocalDateTime.of(2015, 3, 18, 14, 30);
        ZoneId newYorkTimeZone = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2015, 3, 18, 14, 30, 0, 0, newYorkTimeZone);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zonedDateTime);

        LocalDate someDate = LocalDate.ofEpochDay(1000);
        LocalDate dayIn2000 = LocalDate.ofYearDay(2001, 100);
        System.out.println(someDate);
        System.out.println(dayIn2000);
//        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));


    }
}
