package Trash;

import AccessSpecifier.Access;

import java.util.ArrayList;
import java.util.Collections;

public class Check2 {
    public static void main(String[] args) {
//        System.out.println("This is 2attempt");
        String name = "Farhan";
        int temp = 857;
//        Access nn = new Access(32,"Rohan");
//        int a ;
//
//        char  c ;
//         int a = temp.length();
//         for (int i =a-1;i>=0;i--){
//              c = temp.charAt(i);
//             System.out.print(c);
//         }
//        System.out.println();

//        System.out.println(add(4,3) );
        StringBuffer fin = new StringBuffer(name);
        System.out.println(fin.reverse());

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(64);
        nums.add(34);
        nums.add(65);
        nums.add(876);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

    }
//        public static int add(int i, int x){
//        return i+x;
//        }

}
