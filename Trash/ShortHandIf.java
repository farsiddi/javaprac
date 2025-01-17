package Trash;
//Ternary operator

import Generics.Ex;

import java.util.Scanner;

public class ShortHandIf {
    public static void main(String[] args) {
//        int n = 10;
//        if (n > 10) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//
//        System.out.println((n > 10) ? "yes" : "no");

        Scanner sc = new Scanner(System.in);
        int fn;

        try {

            fn = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e.toString());

            fn = 0;
        }
        System.out.println(fn);
    }

}
