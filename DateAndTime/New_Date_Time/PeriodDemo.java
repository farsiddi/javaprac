package DateAndTime.New_Date_Time;

import java.time.LocalDate;
import java.time.Period;

/**
 * <p> used to represent a date-based amount of time in terms of years, months, and days</p>
 * Use Period when dealing with LocalDate, LocalDateTime and ZonedTime
 */
public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2015, 9, 9);
        LocalDate date2 = LocalDate.now();
        Period period = Period.between(date1, date2);
        System.out.println(period);

        Period period1 = Period.of(1, 1, 1);
        System.out.println(period1);
        LocalDate date3 = date2.plus(period1);
        System.out.println(date3);

    }
}
