package Collections.ArrayListExample;

import java.util.ArrayList;

public class WorkShopApp {
    public static void main(String[] args) {
        ArrayList<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("Spinner", 101.12, "For entertainment"));
        listOfProducts.add(new Product("Bottle", 242.32, "Utility"));
        listOfProducts.add(new Product("Stethoscope", 1999.22, "medical use"));
        listOfProducts.add(new Product("Stethoscope", 1999.22, "medical use"));

//        System.out.println(listOfProducts);

        for (Product prd : listOfProducts) {
            System.out.println(prd);
        }

        System.out.println("Now changes");

        listOfProducts.add(1, new Product("Smartphone", 27382.12, "Mobility"));
        for (Product prd : listOfProducts) {
            System.out.println(prd);
        }
        listOfProducts.remove(3);

        System.out.println("Now changes");

        for (Product prd : listOfProducts) {
            System.out.println(prd);
        }

        System.out.println("Now changes");

        listOfProducts.set(0, new Product("Fidget spinner", 101.12, "For entertainment"));

        for (Product prd : listOfProducts) {
            System.out.println(prd);
        }
        System.out.println("Now changes");

        System.out.println(listOfProducts.get(2));

        System.out.println("Now changes");

        System.out.println("The size of the ArrayList is: "+listOfProducts.size());

    }
}
