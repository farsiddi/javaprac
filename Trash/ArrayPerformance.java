package Trash;

import java.util.ArrayList;

public class ArrayPerformance {
    public static void main(String[] args) {
        String series = "";
//        Below is not a good approach because each time the new object is created,
//        then series starts pointing to it, and then the old object is dereferenced
//        Memory waste - Time complexity O(n2)
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.print(ch);
            series += ch;
        }
        System.out.println();
        System.out.println(series);
//        Some other datatype that is mutable other than String
//        StringBuilder - only one object is created and changes are made in that object and the same reference
        StringBuilder Sbuild = new StringBuilder();
        for (int i =0;i<26;i++){
            char ch = (char)('a'+i);
            Sbuild.append(ch);
        }
        System.out.println(Sbuild);
        int[] arr = {4,5,6,7};
//        ArrayList<>
        int target = 9;


    }
}
