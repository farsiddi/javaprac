package DateAndTime.New_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * <li>a temporal object is an instance of a class that represents a point in time or a unit of time. These objects are part of the java.time.temporal package and implement the Temporal interface.</li>
 * <br>Used to extract information from other types of temporal objects like LocalDate, LocalDateTime, LocalTime
 * <br> Most of the objects we create in the New Date-Time API are immutable.
 * <li>with() - use to create a new object from the earlier ones by modifying some field - returns a new copy of the object  </li>
 * <br> If you are trying to create a new object of a different data type, then use to(), if you are trying to create a new object of a same data type, then use with(),
 */
public class FromWithDemo {
    public static void main(String[] args) {
        // Converts from one type to another type (from - created an instance with some modified field)
        LocalDateTime localDateTime = LocalDateTime.of(2017, Month.JUNE, 18, 22, 12);
        System.out.println(localDateTime);
        LocalDate date = LocalDate.from(localDateTime);
        System.out.println(date);

        LocalDateTime dateTime = localDateTime.withYear(9999); // create a new object with year = 9999
        System.out.println(dateTime);// Converts from one type to another type (with - created an instance with some modified field of the same datatype)
    }
}
