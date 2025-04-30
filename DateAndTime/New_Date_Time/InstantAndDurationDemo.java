package DateAndTime.New_Date_Time;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

/**
 * <p> Instant class represents a specific moment in time on the timeline. Instant objects are immutable, meaning their values cannot be changed after creation. This makes them thread-safe and suitable for use in concurrent environments.</p>
 * <br>Period class represents a quantity of time in terms of years, months and days, and
 * <br> Duration class represents a quantity of time in terms of seconds and nanoseconds. Use to identify the duration of time between two instance, times and date times. Use when you are dealing with Instants.
 */
public class InstantAndDurationDemo {
    /**
     * PT - Period of Time
     */
    public static void main(String[] args) {

        Instant i1 = Instant.ofEpochSecond(2000); // 33 minutes added to the epoch time
//        System.out.println(i1);
//        System.out.println(Instant.now()); // Current date and time UTC

//        System.out.println(i1.getEpochSecond());
        Duration d1 = Duration.ofDays(5);
        Duration d2 = Duration.ofMinutes(30);
        Duration d23 = Duration.ofSeconds(50);
//        System.out.println(d1);
//        System.out.println(d2);
        Instant i2 = i1.plus(d1);
        System.out.println(i2); // 6th January - added 5 days to the Epoch time

        System.out.println(i2.isAfter(i1));
        System.out.println(i2.isBefore(i1));
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2000, 9, 9);
        System.out.println(ld1.isAfter(ld2));
        System.out.println(ld1.isBefore(ld2));
        System.out.println(Duration.between(i1, i2)); // we added 5 days in i2 so getting - PT120H
    }
}
