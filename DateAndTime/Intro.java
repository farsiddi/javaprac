package DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.sql.Date;

/**
 * <ul>java.util.Date: Includes both date and time information.
 * java.sql.Date: Only includes the date part. The time component is set to 00:00:00.</ul>
 * <ul>java.util.Date: Used in general Java programming for date and time operations.
 * java.sql.Date: Used when interacting with SQL databases, particularly for date columns in database tables.</ul>
 * <br>Epoch time, also known as Unix time or POSIX time, is a system for tracking time in computing. It represents the number of seconds that have elapsed since the Unix epoch, which is 00:00:00 UTC on January 1, 1970.
 */
public class Intro {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//        System.out.println(date);
        Date date1 = new Date(20, 8, 16);
//        System.out.println(date1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println(simpleDateFormat.format(date));
        String st = "2100-08-07 14:30:10";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date formattedDate = simpleDateFormat1.parse(st);a



    }
}