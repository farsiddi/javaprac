package LambdaStream.section_24.stream.collectandthen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// Puts in map

public class GroupingBy {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Samsung", 938),
                new Product("Apple", 1073),
                new Product("Xiaomi", 801),
                new Product("Vivo", 721),
//                new Product("Micromax", 459),
                new Product("Micromax", 459)
        );

        Map<Integer, List<Product>> groupByPrice = productList.stream().collect(Collectors.groupingBy(
                product -> product.getPrice()
        ));
        System.out.println(groupByPrice);
    }
}
