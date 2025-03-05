package LambdaStream.section_24.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Represents an operation upon two operands of the same type, producing a result of the same type as the operands.<br>
 * This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
 */
public class BinaryDemo {
    public static void main(String[] args) {
        BinaryOperator<Double> powerCalc = (num, num1) -> Math.pow(num, num1);
        System.out.println(powerCalc.apply(2.0, 5.0));

        BinaryOperator<Integer> maxx = BinaryOperator.maxBy((o1, o2) -> Integer.compare(o1, o2));
        System.out.println(maxx.apply(23, 353));
        BinaryOperator<Integer> minn = BinaryOperator.minBy((o1, o2) -> Integer.compare(o1, o2));
        System.out.println(minn.apply(23, 353));


    }
}
