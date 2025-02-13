package LambdaStream.section_24.lambda;

// Handles the scenerio where it accepts two type of parameter of any data type and return any data type after processing result.

import java.util.function.Function;

public class FunctionalFunctionDemo {
    public static void main(String[] args) {

        Function<String, String> str = (input) -> input.toUpperCase();

        System.out.println(str.apply("Alex"));
        Function<String, Integer> coutnLetterers = (input) -> input.length();
        System.out.println(coutnLetterers.apply("Hello how are you"));
        System.out.println("chaining method");

        Function<Integer, Integer> addValue = num -> num + 3;
        Function<Integer, Integer> multValue = num -> num * 4;
        Function<Integer, Integer> out1 = addValue.andThen(multValue);
        Function<Integer, Integer> out2 = addValue.compose(multValue);
        System.out.println(out1.apply(3));
        System.out.println(out2.apply(3));

        String st = "Alex";

    }
}