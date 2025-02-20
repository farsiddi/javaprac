package Enums;

import java.util.Arrays;
import java.util.EnumSet;

public class EnumDemo {
    Day day;

    public static void main(String[] args) {
        Day day1 = null;
        System.out.println(Day.FRIDAY);
//        allOf - Creates an enum set containing all of the elements in the specified element type.
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println(allDays);

//      Creates an enum set initially containing the specified elements.
        EnumSet<Day> weekendEnum = EnumSet.of(Day.FRIDAY, Day.SATURDAY, Day.SUNDAY);
//        System.out.println(Arrays.toString(weekendEnum.values())); // this wont work because weekendEnum is enumSet not an array
        System.out.println(weekendEnum);


//        Creates an enum set initially containing all of the elements in the range defined by the two specified endpoints.
        EnumSet<Size> healthyPeople = EnumSet.range(Size.SMALL, Size.LARGE);
        EnumSet<Size> unHealthyPeople = EnumSet.range(Size.EXTRA_LARGE, Size.EXTRA_EXTRA_LARGE);
        System.out.println("Healthy sizes - " + healthyPeople);
        System.out.println("Unhealthy sizes - " + unHealthyPeople);

//        Creates an enum set with the same element type as the specified enum set,
//        initially containing all the elements of this type that are not contained in the specified set.
        EnumSet<Size> notHealthyPeople = EnumSet.complementOf(healthyPeople); // Size enum - healthy = unhealthy/notHealthy
        System.out.println("Not healthy people - " + notHealthyPeople);

    }

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public enum Size {
        SMALL, MEDIUM, LARGE, EXTRA_LARGE, EXTRA_EXTRA_LARGE;
    }
}
