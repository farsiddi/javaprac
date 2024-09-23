package Trash;

public class MonthsEnums {
    enum Month{
//        Enums are special data type  that allows you to define a set of named constants.
//        It provides a way to represent a fixed number of predefined values as a group.
//        public ,static, final they are
//        type of every constant is Month
        January,February,March,April,May,June,July,August,September,October,November,December
    }

    public static void main(String[] args) {
        Month month;
        month = Month.April;
        System.out.println(month);

        for (Month mth : Month.values()) {
            System.out.println(mth);
        }
        System.out.println(month.ordinal());
    }
}
