package Trash;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        arr_list.add(10);
        arr_list.add(21);
        arr_list.add(78);
        arr_list.add(54);
        System.out.println(arr_list); //we can do that because internally it implements the toString
        arr_list.set(1,99);
        System.out.println(arr_list);
        arr_list.remove(1);
        System.out.println(arr_list);

        for (int i=0;i<5;i++){
            arr_list.add(sc.nextInt());
        }
        System.out.println(arr_list);

    }
}
