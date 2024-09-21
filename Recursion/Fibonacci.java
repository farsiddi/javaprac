package Recursion;

// 0,1,1,2,3,5,8,13,21

//import java.util.Scanner;
//
//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int range;
//        range = sc.nextInt();
//        int x = 0, y = 1, count = 0;
//        System.out.println(x);
//        System.out.println(y);
//        nextNumber(x, y, range, count);
//    }
//
//    static void nextNumber(int a, int b, int range, int count) {
//        int sum;
//        sum = a + b;
//        if (count > range - 3) {
//            return;
//        }
//        System.out.println(sum);
//        a = b;
//        b = sum;
//        count++;
//        nextNumber(a, b, range, count);
//    }
//}

//public class Fibonacci {
//
//    public static void main(String[] args) {
//        int n = 10; // Change n to the desired number of Fibonacci numbers
//        System.out.println("Fibonacci Series up to " + n + " numbers:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
//}

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(30));
    }

    static int fibonacci(int n) {
        //     Base condition
        if (n < 2) {
            return n;
        }
//        fib(n-1) + fib(n-2) is the recurrence relation
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}