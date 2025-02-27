package Logic;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));  // true
        System.out.println(isAnagram("triangle", "integral"));  // true
        System.out.println(isAnagram("Astronomer", "Moon starer"));  // true (ignores spaces and case)
        System.out.println(isAnagram("Dormitory", "Dirty room"));  // true
        System.out.println(isAnagram("School master", "The classroom"));  // true
        System.out.println(isAnagram("hello", "world"));  // false
        System.out.println(isAnagram("java", "python"));  // false
        System.out.println(isAnagram("apple", "papel ")); // True
        System.out.println(isAnagram("abc", "abcd"));  // false (different lengths)

    }

    static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        StringBuilder newString1 = new StringBuilder();
        StringBuilder newString2 = new StringBuilder();
        char x, y;

        for (int i = 0; i < s1.length(); i++) {
            x = s1.charAt(i);
            if (Character.isLetter(x)) {
                newString1.append(x);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            y = s2.charAt(i);
            if (Character.isLetter(y)) {
                newString2.append(y);
            }
        }
        if (newString1.length() != newString2.length()) return false;

        char[] arr1 = newString1.toString().toCharArray();
        char[] arr2 = newString2.toString().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < newString1.length(); i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
//        if (!Arrays.equals(arr1,arr2)) return false; // Use this instead of manually iterating each element
        return true;
    }
}
