package Trash;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<>();
        int size = sc.nextInt();
        String query_type;
        for (int i = 0; i < size; i++) {
            ls.add(sc.nextInt());
        }
        int num_queries = sc.nextInt();
        int at_index;
        int new_value;
        for (int i = 0; i < num_queries; i++) {
            query_type = sc.next();
            at_index = sc.nextInt();
            new_value = sc.nextInt();
            if (at_index >= 0 && at_index <= ls.size()) {
                if (query_type.toLowerCase().equals("insert")) {
                    ls.add(at_index, new_value);
                } else {
                    ls.remove(at_index);
                }

            }
        }
        System.out.println(ls);
        sc.close();

    }
}

