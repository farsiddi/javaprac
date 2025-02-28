package LambdaStream.section_24.optional;

import java.util.Optional;
import java.util.Random;

/**
 * Java 8<br>
 * A container object introduced to help avoid NullPointerException.<br>
 * It represents an optional value that may or may not be present.<br>
 * <p>
 * Optional is primarily intended for use as a method return type where there is a clear need to represent "no result," and where using null is likely to cause errors.
 */
public class Intro {
    public static void main(String[] args) {

//        String str = greet();
//        if (str != null) System.out.println(str.toUpperCase()); // before 8 we need to check for null
        Optional<String> stringOptional = greet();
        System.out.println(greet());  // if .get method is used some time gets runtimeException - NoSuchElementException
//        stringOptional.ifPresent(s -> System.out.println("Value Present " + s)); // method reference
        if (stringOptional.isPresent()) System.out.println("Value Present " + stringOptional.get());
    }

    //    public static Optional<String> greet() {
//
//        Random rnd = new Random();
//        int k = rnd.nextInt();
//        System.out.println(k);
//        if (k % 2 == 0) return Optional.of("Even");
////        return null;
//        return Optional.empty();
//    }

    /**
     * Important methods provided by Optional in Java 8:
     * <ul>
     *   <li><b>of()</b> - Returns an Optional describing the given non-null value.</li>
     *   <li><b>ofNullable()</b> - Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.</li>
     *   <li><b>empty()</b> - Returns an empty Optional instance.</li>
     *   <li><b>isPresent()</b> - Returns true if a value is present; otherwise, returns false.</li>
     *   <li><b>get()</b> - Returns the value wrapped by this Optional if present; otherwise, throws a NoSuchElementException.</li>
     *   <li><b>ifPresent()</b> - If a value is present, invokes the specified consumer with the value; otherwise, does nothing.</li>
     *   <li><b>orElse()</b> - Returns the value if present; otherwise, returns the given default value.</li>
     *   <li><b>orElseGet()</b> - Returns the value if present; otherwise, returns the one provided by the given Supplier.</li>
     *   <li><b>orElseThrow()</b> - Returns the value if present; otherwise, throws the exception created by the given Supplier.</li>
     *   <li><b>map()</b> - If a value is present, applies the provided mapping function to it.</li>
     *   <li><b>filter()</b> - If the value is present and matches the given predicate, returns this Optional; otherwise, returns the empty one.</li>
     * </ul>
     */

    public static Optional<String> greet() {
        int rnd = new Random().nextInt();
        System.out.println(rnd);
        String message = null;
        if (rnd % 2 == 0) message = "even";
        return Optional.ofNullable(message);
    }
}
