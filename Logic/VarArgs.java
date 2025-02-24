package Logic;

import javax.swing.*;

public class VarArgs {
    public static void main(String[] args) {
        String[] s = {"hhelo", "Alex", "Cat", "Autobots"};
        printAll(s);

        System.out.println();

    }

    static void printAll(String... str) {
        for (String st : str) {
            System.out.println(st);
        }
    }

    /**
     * Java allows only one varargs (...) parameter per method.
     */
    static void printDifferent(String str, int... num) {

    }
}
