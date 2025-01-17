package LambdaStream.section_24.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class HelloLambdaDemo {
    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Hello there, how are you ?");
        Hello hello1 = () -> System.out.println("I am doing good");
        hello1.sayHello();
        hello.sayHello();
        process(hello);
        process(() -> System.out.println("bahut badhiya"));

    }

    public static void process(Hello hello) {
        hello.sayHello();
    }
}
