package LambdaStream.section_24.stream.collectandthen;

import java.util.*;
import java.util.stream.Collectors;

public class CollectAndThenDemo {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Samsung", 938),
                new Product("Apple", 1073),
                new Product("Xiaomi", 801),
                new Product("Vivo", 721),
                new Product("Micromax", 459)
        );

//        String maxPriceProd = productList.stream().collect(Collectors.collectingAndThen(
//                Collectors.maxBy(Comparator.comparing(Product::getPrice)),
//                ((prod) -> prod.isPresent() ? prod.get().getName() : "None")
//        ));
//        System.out.println(maxPriceProd);

        Collections.sort(productList, (e1, e2) -> Integer.compare(e2.getPrice(), e1.getPrice()));
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }
}
