package LambdaStream.section_24.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//used when we want send the input but not expect any return value | SAM(accept) | likker setter methods in pojo classes

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> ct = (input) -> System.out.println(input.toUpperCase());
        ct.accept("kdbcvjbkjrbckjbr");

        Consumer<Integer> squareNum = input -> System.out.println(input * input);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 4, 5));
//        for (Integer num : arr) {
//            squareNum.accept(num);
//        }
        arr.forEach(squareNum);

    }
}
