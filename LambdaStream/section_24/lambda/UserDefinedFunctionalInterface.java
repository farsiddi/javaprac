package LambdaStream.section_24.lambda;

public class UserDefinedFunctionalInterface {
    public static void main(String[] args) {
        UserDefinedFunctionalInterfaceDemo demo = num -> {
            System.out.println(num * num);
        };

        demo.add(6);
    }
}
