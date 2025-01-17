package Exception.section_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
//        int x = sc.nextInt();
//        System.out.println(x);
//        sc.close();
        int x;
        try {
            x = sc.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
//            System.out.println(e);;
            System.out.println(exception.getCause());
            System.out.println("numeric vaue");
            throw new InputMismatchException("nejfcnjrbcvj");
        } finally {
            sc.close();
        }

//        try with resources - JAVA 7
//        try (Scanner scanner = new Scanner(System.in)) {
////            scanner will automatically close by the jvm
//              scanner variable is a final in this case
//        }
    }
}
