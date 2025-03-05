package LambdaStream.section_24.lambda;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * functional interface that accepts two arguments and produces a result.
 * <ul>
 *   <li>✅ {@link java.util.function.BiFunction} {@code <T, U, R>} - Use when two inputs produce an output.</li>
 *   <li>✅ {@link java.util.function.BiPredicate} {@code <T, U>} - Use when you need a boolean check.</li>
 *   <li>✅ {@link java.util.function.BiConsumer} {@code <T, U>} - Use when you just perform an action (no return value).</li>
 *   <li>✅ {@link java.util.function.BinaryOperator} {@code <T>} - Use when input and output types are the same.</li>
 * </ul>
 */
public class BiFunctionalDemo {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> sumEven = (a, b) -> (a + b) % 2 == 0;
        System.out.println(sumEven.test(6, 2));


        BiFunction<Double, Double, Double> biFunction = (integer, integer2) -> Math.pow(integer, integer2);
        System.out.println(biFunction.apply(2.0, 5.0));

        BiConsumer<String , Integer> biConsumer = (str,intt) -> System.out.println("My name is "+str+" and my age is "+intt);
        biConsumer.accept("Alex",29);
    }
}
