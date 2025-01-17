package LambdaStream.section_24.lambda;

public class IntroLambda {

//    Expression Lambda -(parameterList)->expression;
//    Expression Lambda -(parameterList)->{statements};

    public static void main(String[] args) {

        greet();
        greet action = () -> System.out.println("good morning");
        action.greet2();
    }

    public static void greet() {
        System.out.println("hello world");
    }

    @FunctionalInterface
    interface greet {
        void greet2();
    }

}
