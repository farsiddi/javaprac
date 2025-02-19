package Generics.Section_19;

import java.lang.reflect.Array;

public class GenericsMethodDemo {
    public static void main(String[] args) {

        String[] strArray = {"Alex", "Carl", "Max", "Charles"};
        printArray(strArray);
//        int[] arr = {1, 2, 43, 654, 57, 8}; // this wont work because generics only deals with reference type(int is a primitive)
        Integer[] arr = {1, 2, 43, 654, 57, 8};
        printArray(arr);
    }

    //    public static void printArray(String[] arr) {
//        for (String str : arr) {
//            System.out.println(str);
//        }
//    }
    public static <T> void printArray(T[] arr) {
        for (T str : arr) {
            System.out.println(str);
        }
    }
}
