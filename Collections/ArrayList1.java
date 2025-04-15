package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr_list = new ArrayList<>();
        arr_list.add(10);
        arr_list.add(21);
        arr_list.add(78);
        arr_list.add(54);
        System.out.println(arr_list);
        System.out.println("HE");
        System.out.println(arr_list.get(3));

    }
}
