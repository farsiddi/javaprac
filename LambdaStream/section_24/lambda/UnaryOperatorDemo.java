package LambdaStream.section_24.lambda;

import java.util.function.UnaryOperator;

//Input and out parameter have the same datatype | Takes only one argument
public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<String> ut = (input) -> input.toUpperCase();
        System.out.println(ut.apply("computer"));

        UnaryOperator<Integer> it = input -> input *input;
        System.out.println(it.apply(9));
    }
}
