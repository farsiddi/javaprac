package LambdaStream.section_24.lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class NewDel {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
//        System.out.println(isEven.test(30));
        UnaryOperator<Integer> uni = num -> num * num;
//        System.out.println(uni.apply(7));
        UnaryOperator<List<Integer>> uniList = list -> list.stream().map(n -> n * n).collect(Collectors.toList());
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
//        System.out.println(uniList.apply(list1));

        Consumer<Integer> con = (num -> System.out.println(num * num));
//        con.accept(9);
        Consumer<String> str = mk -> System.out.println(mk.toUpperCase());
//        str.accept("Ferguson");
        Supplier<Integer> currentDate = () -> LocalDateTime.now().getDayOfMonth();
//        System.out.println(currentDate.get());
        Supplier<Integer> randInt = () -> (int) (Math.random() * 10);
//        System.out.println(randInt.get());

        String str1 = "Hello World";
        StringBuilder rever = new StringBuilder(str1).reverse();
//        System.out.println(rever);

        for (int i = str1.length() - 1; i >= 0; i--) {
//            System.out.print(str1.charAt(i));
        }
//        System.out.println(isPalindrome("rotator"));
        List<String> palindromCheck = List.of("rotator", "madam", "computer", "noon", "level", "hello");
        for (String chk : palindromCheck) {
            System.out.println(isPalindrome(chk));

        }

    }

    static boolean isPalindrome(String orgStr) {

        int start = 0;
        int end = orgStr.length() - 1;
        while (start < end) {
            if (orgStr.charAt(start) != orgStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }


        return true;
    }
}
