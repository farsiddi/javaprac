package LambdaStream.section_24.lambda;

// Will return value without accept any data | Just like otp no input only output | SAM(get) | no static and default method | like getter

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> getMonth = () -> LocalDate.now().getMonthValue();
        System.out.println(getMonth.get());

        Supplier<String> currentDayName = () -> LocalDate.now().getDayOfWeek().name();
        System.out.println(currentDayName.get());


    }
}
