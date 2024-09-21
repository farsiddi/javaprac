package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumofdigits(5454));

    }

    static int sumofdigits(int n) {

        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumofdigits(n / 10);

    }
}
