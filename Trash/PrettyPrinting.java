package Trash;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 23742.32443f;
        System.out.printf("Formatted number is: %.2f", a); // Also does the rounding off
        System.out.println();

//        Placeholders
        System.out.printf("Hello my name is %s and i'm from %s", "Faran", "LKO");
        System.out.println();

        System.out.println('a' + 'b'); // character ascii value addition
        System.out.println((char) ('a' + 3));
        System.out.println(("a" + 1));
//        1 is converted into wrapper class Integer: "a" + "1"
        System.out.println("Faran" + new ArrayList<>()); // toString will be called
//        System.out.println(new Integer(56) + new ArrayList<>()); only for primitive and if one of the object is string

        System.out.println();
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.print(ch);
            series += ch;

        }

        
        System.out.println();
        System.out.println(series);
    }
}
