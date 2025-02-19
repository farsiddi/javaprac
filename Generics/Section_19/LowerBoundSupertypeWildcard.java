package Generics.Section_19;

import AbstractInterface.InterfaceExtends.A;
import Generics.Section_19.CovarianceDemo.Developer;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundSupertypeWildcard {
    public static void main(String[] args) {
        addnumer(new ArrayList<>());
//        addnumer(new ArrayList<Object>()); // this will do as object is the suoerclass of Integer

    }

//    public static void addNum(List<? super Integer> list) {
//        for (Object num : list) {
//            System.out.println(num);
//        }
//    }

    public static void addnumer(List<? super Integer> list) {
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
//        list.add(323.32) // as double is not related to Integer to anyway
        System.out.println(list);
    }
}
