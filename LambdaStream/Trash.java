package LambdaStream;

import java.util.Arrays;

public class Trash {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        Arrays.stream(arr).filter(num -> num % 2 == 0).sorted().forEach(num -> System.out.println(num));
    }
}
