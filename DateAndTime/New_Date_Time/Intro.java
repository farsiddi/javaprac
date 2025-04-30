package DateAndTime.New_Date_Time;

import java.time.*;

/**
 * LocalDate, LocalTime, LocalDateTime and zonedDateTime -> static method now();
 * <li>a temporal object is an instance of a class that represents a point in time or a unit of time. These objects are part of the java.time.temporal package and implement the Temporal interface.</li>
 */
public class Intro {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
//        ZoneId  zoneId = ZoneId
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

    }


}
