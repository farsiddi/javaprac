package Recursion;

public class ReverseNumberHelperFunction {
    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    public static void main(String[] args) {
        rev1(12340);
        System.out.println(sum);
        System.out.println(reverse(567, 0));
    }

    static int reverse(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        int lastDigit = n % 10;
        reversed = reversed * 10 + lastDigit;
        return reverse(n / 10, reversed);
    }
}