package Collections.ArrayListExample;

import java.util.ArrayList;

public class WorkShopApp {
    public static void main(String[] args) {
        ArrayList<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("Spinner",101.12,"For entertainment"));
        listOfProducts.add(new Product("Bottle",242.32,"Utility"));
        listOfProducts.add(new Product("Stethoscope",1999.22,"medical use"));
        listOfProducts.add(new Product("Stethoscope",1999.22,"medical use"));
        System.out.println(listOfProducts);
        for(Product prd : listOfProducts){
            System.out.println(prd);
        }

    }
}
