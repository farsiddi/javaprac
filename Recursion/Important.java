package Recursion;

public class Important {
    public static void main(String[] args) {
        concept(5);
    }

    static void concept(int n) {
        if (n == 0) {
            return;

        }
        System.out.println(n);
//        concept(n--);  give infinite recursion - stack overflow
//        because it passes the value first then subtracts it
        concept(--n);
    }
}
