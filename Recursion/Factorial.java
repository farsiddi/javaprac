package Recursion;

//public class Factorial {
//    public static void main(String[] args) {
//        int total = 1, n = 7;
//        System.out.println(fact(n, total));
//    }
//
//    static int fact(int n, int total) {
//        if (n == 1) {
//            return total;
//        }
//        total = total * n;
//        n = n - 1;~
//        return fact(n, total);
//    }
//}
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
//        f(n) = n * f(n-1) is the recurrence relation
    }
}
