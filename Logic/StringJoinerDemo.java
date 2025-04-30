package Logic;

import java.util.StringJoiner;

/**
 * The StringJoiner class, introduced in Java 8, provides an efficient way to concatenate multiple strings with a delimiter, along with optional prefix and suffix.
 */
public class StringJoinerDemo {
    public static void main(String[] args) {
//        String name = "Alex";
//        IntStream integerStream = name.chars();
//        System.out.println(integerStream);
        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add("Apple");
        stringJoiner.add("Banana");
        stringJoiner.add("Guava");
        System.out.println(stringJoiner);

        StringJoiner stringJoiner1 = new StringJoiner(" ,", "(", ")");
        stringJoiner1.add("Apple");
        stringJoiner1.add("Banana");
        stringJoiner1.add("Guava");
        stringJoiner1.add("Tomato");
        stringJoiner1.add("Mango");
        System.out.println(stringJoiner1);

    }
}

