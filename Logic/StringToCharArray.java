package Logic;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String name = "Farhan Siddiqui";
        System.out.println(Arrays.toString(name.toCharArray()));
        String name1 = "          Rohan   ";
        System.out.println(name1.strip());
        String greet = "Hello, how are you ?";
        System.out.println(Arrays.toString(greet.split(" "))); // Take scissors and cut where the spaces are there


    }
}
