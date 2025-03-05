package LambdaStream.section_24.lambda;

// Handles the scenerio where it accepts one parameter and return the boolean after processing the input

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

// yse the test method
public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        Predicate<Integer> isGraterThan = (num) -> num > 50;
        System.out.println(isGraterThan.test(100));
        System.out.println(isEven.test(66));
        System.out.println(isEven.and(isGraterThan).test(88));

        System.out.println(isGraterThan.or(isEven).test(77));

        System.out.println("66 is odd - " + isEven.negate().test(63));
        System.out.println("Predicate from Predicate");

        Predicate<Integer> isOdd = Predicate.not(isEven);
        System.out.println(isOdd.test(63));

        System.out.println("Predicate equal");
        Predicate<String> isEqual = Predicate.isEqual("ALex");
        System.out.println(isEqual.test("ALex"));

        UnaryOperator<Integer> un = (num) -> num * num;
        un.apply(4);

        IntPredicate str = input -> input % 2 == 0;  // Same for other functional interface, saves time because of autoboxing
        System.out.println("value is " + str.test(32));

    }
}