package LambdaStream.section_24.stream.collectandthen;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//  Accepts Prdeicate as an argument

public class PartitionBy {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Samsung", 938),
                new Product("Apple", 1073),
                new Product("Xiaomi", 801),
                new Product("Vivo", 721),
                new Product("Micromax", 459)
        );

        Map<Boolean, List<Product>> prodList = productList.stream().collect(Collectors.partitioningBy(
                prod -> prod.getPrice() > 600
        ));
        System.out.println(prodList);
    }
}
