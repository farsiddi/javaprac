package DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Calendar - An abstract class
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        System.out.println(calendar.getTime());
        System.out.println(currentDate);
        System.out.println(currentDate.getYear()); // Current year - 1900

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.get(Calendar.YEAR));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");
        String dateFormat = simpleDateFormat.format(gregorianCalendar.getTime());
        System.out.println(dateFormat);
        gregorianCalendar.add(Calendar.YEAR, 11);
        System.out.println(gregorianCalendar.get(Calendar.YEAR)); // added 11 years to the current year and same for subtraction(give negative value)
        System.out.println(gregorianCalendar.isLeapYear(2027)+"-"+gregorianCalendar.isLeapYear(2048));
        ;

    }
}
