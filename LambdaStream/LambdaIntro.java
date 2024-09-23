package LambdaStream;

import AbstractInterface.AbstractAndInterface.Interface;

import java.util.ArrayList;
import java.util.function.IntConsumer;

// Anonymous function having - no name, no return type, no modifiers
//A lambda expression is a short block of code which takes in parameters and returns a value.
// Lambda expressions are similar to methods, but they do not need a name, and they can be implemented right in the body of a method.
//(parameter1, parameter2) -> expression
//(parameter1, parameter2) -> { code block }
//Invoke lambda expression by using functional interface;
public class LambdaIntro {


    public static void main(String[] args) {

        String st = "Alex Adam";

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            System.out.println(n);
        });
        for (int n : numbers) {
            System.out.println(n);
        }


    }

}
