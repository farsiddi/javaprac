package Enums;

import BasicOOPs.Switch;
import Logic.Prime;


/**
 * * special data type in Java used to define a fixed set of constants.
 * * Enums are type-safe and prevent invalid values.
 * * <p>
 * * ✅ Type-Safe	Prevents invalid values (no unexpected integers).
 * * ✅ More Readable	Improves code clarity (no "magic numbers").
 * * ✅ Easier Debugging	Printing an enum gives meaningful output.</p>
 * <p>Type Safety-
 * Prevents passing invalid values to methods.Ensures only predefined constants are used.</p>
 * <p>Readability-
 * Improves code clarity by using named constants.Makes the code easier to understand and maintain.</p>
 * <p>Robustness-
 * Provides a centralized way to manage constants.Reduces the risk of introducing bugs when modifying values.</p>
 * <p> Code Organization-
 * Groups related constants in one place.Makes it easier to locate and update values.</p>
 * <p>Switch Statements-
 * Can be used in switch statements.Improves readability and maintainability.
 * <p/>
 */
public class Intro {

    public static final int LOW = 0;
    public static final int MEDIUM = 1;
    public static final int HIGH = 2;
    public static final int URGENT = 3;

    /**
     * @param args Command-line arguments
     * @throws ArrayIndexOutOfBoundsException if the array index is out of bounds
     */
    public static void main(String[] args) {
//        System.out.println("Number of days reuired for low priority tasks - " + getNumDays(LOW));
//        System.out.println("Number of days reuired for medium priority tasks - " + getNumDays(MEDIUM));
//        System.out.println("Number of days reuired for urgent priority tasks - " + getNumDays(URGENT));
        TaskStatus taskStatus = null;
//       System.out.println(getCountDays(taskStatus)); // gives null pointer exception
//        TaskStatus taskStatus1 = new TaskStatus(); // Cant be instantiated

        System.out.println(getCountDays(TaskStatus.LOW)); // this makes a lot more readable
        System.out.println(getCountDays(TaskStatus.MEDIUM));
        System.out.println(getCountDays(TaskStatus.URGENT));
//        System.out.println(getCountDays(TaskStatus.VERY_HIGH)); // also no other values are allowed
        System.out.println(TaskStatus.HIGH.ordinal()); // ts position in its enum declaration
        System.out.println("For loop");
        for (TaskStatus status : TaskStatus.values()) {
            String name = status.name();
            int num = status.ordinal();
            System.out.println(name + " ordinal " + num);
        }
    }

    public static int getNumDays(int count) {
        return switch (count) {
            case LOW -> 7;
            case MEDIUM -> 5;
            case HIGH -> 3;
            case URGENT -> 1;

            default -> throw new IllegalStateException("Unexpected Value");

        };
    }

    /**
     * values inside the enums are implicitly final
     * values should be related to each other like it should be of same category(different category not recommended)
     * can not be instantiated
     * No extend allowed | implement allowed
     * Order/Sequence is maintained
     */
    public enum TaskStatus {

        //        LOW(0), MEDIUM(1), HIGH(2), URGENT(3)
//        private final int code;
//
//        TaskStatus(int code) {
//            this.code = code;
//        }
//
//        public int getCode() {
//            return code;
//        }
        LOW, MEDIUM, HIGH, URGENT
    }

    public static int getCountDays(TaskStatus taskStatus) {
        return switch (taskStatus) {

            case LOW -> 7;
            case MEDIUM -> 5;
            case HIGH -> 3;
            case URGENT -> 1;
        };

    }


}