package DateAndTime.New_Date_Time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class GetMinusDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2005, 6, 21);

        int monthNum = date.getMonthValue();
        Month month = date.getMonth();
        System.out.println(month);
        int day = date.getDayOfMonth();
        System.out.println(day);
        DayOfWeek dayName = date.getDayOfWeek();
        System.out.println(dayName);

        LocalDate ld = date.plusDays(100);
        System.out.println(ld);
        LocalDate ld1 = date.minusYears(5);
        System.out.println(ld1);

    }
}
