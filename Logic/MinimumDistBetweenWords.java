package Logic;

import java.util.Scanner;

public class MinimumDistBetweenWords {
    public static void main(String[] args) {
        String[] str = {"the", "quick", "brown", "fox", "ship"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String s1 = sc.next().toLowerCase();
        System.out.println("Enter the second word: ");
        String s2 = sc.next().toLowerCase();
        int first_index = 0, second_index = 0;
        for (int i = 0; i < str.length; i++) {
            if (s1.equals(str[i])) {
                first_index = i;
            }
            if (s2.equals(str[i])) {
                second_index = i;
            }
        }
        System.out.println(second_index - first_index);

    }
}
