package DateAndTime;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * If there is a requirement to create date and time with respect to a particular time zone.
 */
public class SpecificTImeZoneDemo {
    public static void main(String[] args) {

//        System.out.println(TimeZone.getAvailableIDs());
        String[] arr = TimeZone.getAvailableIDs();
//        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (String st : arr) {
//            System.out.println(st);
            count++;
        }
        System.out.println(count);
        String st = "YYYY-MM-DD HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(st);
        sdf.setTimeZone(TimeZone.getTimeZone("Africa/Casablanca"));
        String formatDate = sdf.format(new Date());
//        System.out.println(formatDate);


        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));
//        Remember to do all the below code (year,month,all the others) -> if not done whenever this getTime() method is invoked behind the scenes, a new Date object is going to be created. And when this object is getting created, it is going to construct the default time zone where the program is running.
        int year = gregorianCalendar.get(Calendar.YEAR);
        int month = gregorianCalendar.get(Calendar.MONTH);
        int date = gregorianCalendar.get(Calendar.DATE);
        int hour = gregorianCalendar.get(Calendar.HOUR_OF_DAY);
        int minutes = gregorianCalendar.get(Calendar.MINUTE);
        int seconds = gregorianCalendar.get(Calendar.SECOND);
        int milliSeconds = gregorianCalendar.get(Calendar.MILLISECOND);

        System.out.printf("Current Date and Time in : %04d-%02d-%02d %02d:%02d:%02d:%04d%n", year, month, date, hour, minutes, seconds, milliSeconds);

        System.out.println(gregorianCalendar.getTime()); // Returning from where the program is running (no specific time zone)

    }
}
