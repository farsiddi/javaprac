package Generics;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(254);
        al.add(285);
        System.out.println(al.get(1));
        if (al.contains(19)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        for (Integer s : al ) {
            System.out.print(s+" ");
        }
        al.set(1,19);
        if (al.contains(19)){
            System.out.println("yes");
        }
        ArrayList<Integer> list = new ArrayList<>();
    }
}
