package Trash;

import java.util.Arrays;

public class JustChecking {
    public static void main(String[] args) {
        int a =23;
        int b =a;
        System.out.println(a+"-"+b);
        b=21;
        System.out.println(a+"-"+b);
        String name = "Farhan";
        String naam = name;
        System.out.println(name+"-"+naam);
        naam = "Watch";
        System.out.println(name+"-"+naam);

        int[] arr1 = {1,2,4,5,6};
        int[] arr2 = arr1;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr2[1] = 9999;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
