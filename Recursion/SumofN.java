package Recursion;

public class SumofN {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    static int sum(int n) {
        if (n == 0) {
            return n;
        }
        return n + sum(n - 1);
    }
}
