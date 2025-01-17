package Logic;

import java.util.Collections;
import java.util.stream.Collectors;

public class StringReverse {
    public static void main(String[] args) {
        String name = "Farhan";
        int len = name.length();
        StringBuilder new_name = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            char c = name.charAt(i);
            new_name.append(c);
        }
        System.out.println(new_name);
        String st = "Happy";
        String reversedString = st.chars().mapToObj(c -> (char) c).collect(Collectors.collectingAndThen(
                Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream();
                })).map(String::valueOf).collect(Collectors.joining());
        System.out.println("\n" + reversedString);

        String reverse = new StringBuilder(st).reverse().toString();
        System.out.println(reverse);

    }
}
