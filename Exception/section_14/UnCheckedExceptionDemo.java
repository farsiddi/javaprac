package Exception.section_14;


public class UnCheckedExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        if (b == 0) {
//            throw new ArithmeticException("Cannot be divided by zero");
//        }

        System.out.println(divide(a, b));
        System.out.println("Hello there");
    }

    public static int divide(int a, int b) throws ArithmeticException {

        return a / b;
    }
}
