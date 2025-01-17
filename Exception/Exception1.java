package Exception;

import java.io.IOException;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println(divide(30, 4));
        System.out.println(divide(30, 0));
        System.out.println("Good job");

    }

    private static int divide(int dividend, int divisor) {

        try {
            if (divisor == 0) {
                throw new ZeroDivider("Divisor cannot be zero - Custom exception");
            }


            return dividend / divisor;
        } catch (ZeroDivider | NumberFormatException exception) {

//            System.err.println("Cant be divided by zero"); // two different streams sysout and syserr and jvm processes these independently.
//           sysout - Stream is buffered, meaning messages may not appear immediately but in order when the buffer flushes.
//           syserr - This stream is unbuffered, meaning messages are sent directly to the console without delay.
            System.out.println("Cant be divided by zero");
//            throw new ArrayStoreException(); Just to show we throw another exception inside the catch block
//            exception.printStackTrace();  Prints where the exception occured
            return 0;
        } finally {
            System.out.println("This finally");
        }
    }
}
