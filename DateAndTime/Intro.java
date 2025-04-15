package DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.sql.Date;

/**
 *
 */
public class Intro {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//        System.out.println(date);
        Date date1 = new Date(20,8,16);
//        System.out.println(date1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println(simpleDateFormat.format(date));
        String st = "2100-08-07 14:30:10";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date formatedDate = simpleDateFormat1.parse(st);
//        System.out.println(formatedDate);
       Date date2 = new Date(System.currentTimeMillis());
        System.out.println(date2);



    }
}