package optional;

import java.util.*;


public class MethodDemo {
    public static void main(String[] args) {
        Optional<String> stringOptional = greet();
//        If a value is present, performs the given action with the value, otherwise does nothing.
//        stringOptional.ifPresent(input -> System.out.println("Value is present " + input)); // if present

//        If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
//        stringOptional.ifPresentOrElse(input -> System.out.println("Value present"), () -> System.out.println("Value absent"));

//        If a value is present, returns the value, otherwise returns value mentioned.
        String message = stringOptional.orElse("Value absent");
//        System.out.println(message);

//        If a value is present, returns the value, otherwise returns the result produced by the supplying function.
        String message1 = stringOptional.orElseGet(() -> "Value absent");
//        System.out.println(message1);

//        If a value is present, returns the value, otherwise throws an exception produced by the exception supplying function.
//        String message3 = stringOptional.orElseThrow();
//        System.out.println(message3);
//        stringOptional.orElseThrow(() -> new InputMismatchException("Kuch bhi"));

//        Optional<String> str2 = stringOptional.map(s -> s.toUpperCase());
//        str2.ifPresent(System.out::println);
//        Optional<String> str3 = stringOptional.filter(val -> val.length() > 3);
//        System.out.println(str3);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 4, null, 55, null, 35, 76));
        integerList.stream().filter(integer -> integer != null).map(integer -> integer + 1).forEach(System.out::println);
        integerList.stream().filter(Objects::nonNull).map(integer -> integer + 1).forEach(System.out::println);
    }

    public static Optional<String> greet() {

        int num = new Random().nextInt();
        System.out.println(num);
        String message = null;
        if (num % 2 == 0) message = "Even";
        return Optional.ofNullable(message);
    }
}
