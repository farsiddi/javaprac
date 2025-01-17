package Exception.section_14;

import java.util.logging.Logger;

public class ArrayIndexOutOfBoundExceptionDemo {

    private static Logger logger = Logger.getLogger(ArrayIndexOutOfBoundExceptionDemo.class.getName());

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6};
//        for (int num : arr) {
//            System.out.println(num);
//        }
//        System.out.println(arr[4]);

        try {
            System.out.println(arr[8]);

        } catch (ArrayIndexOutOfBoundsException exception) {
            logger.severe("Invalid Array index.Please try again.I");
//            System.out.println("Invalid Array index.Please try again.");
        }


    }
}
