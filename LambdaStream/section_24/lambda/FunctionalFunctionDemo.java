package LambdaStream.section_24.lambda;

// Handles the scenario where it accepts two types of parameter of any data type and return any data type after a processing result.


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionalFunctionDemo {
    public static void main(String[] args) {

        Function<String, String> str = (input) -> input.toUpperCase();

        System.out.println(str.apply("Alex"));
        Function<String, Integer> coutnLetterers = (input) -> input.length();
        System.out.println(coutnLetterers.apply("Hello how are you"));
        System.out.println("chaining method");

        Function<Integer, Integer> addValue = num -> num + 3;
        Function<Integer, Integer> multiValue = num -> num * 4;
        Function<Integer, Integer> out1 = addValue.andThen(multiValue);
        Function<Integer, Integer> out2 = addValue.compose(multiValue);
        System.out.println(out1.apply(3));
        System.out.println(out2.apply(3));

        String st = "Alex";
        Function<String, Integer> strLen = String::length;
        System.out.println(strLen.apply("Smith"));

    }

}