package DateAndTime.New_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Used to combine date and time objects to create more complex temporal objects.
 * <br> If you are trying to create a new object of a different data type, then use to(), if you are trying to create a new object of a same data type, then use with(),
 */
public class ToAtDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime);

        LocalDate date = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime(); // Converts from one type to another type (with - created an instance with some modified field of the same datatype)
        System.out.println(date);
        System.out.println(localTime);

        LocalDate date1 = LocalDate.of(2015, 11, 17);
        LocalDateTime localTime1 = date1.atStartOfDay();
        System.out.println(localTime1);
        LocalDateTime localDateTime1 = date1.atTime(18, 20);
        System.out.println(localDateTime1);

    }
}
