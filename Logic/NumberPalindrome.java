package Logic;

public class NumberPalindrome {
    static boolean isPalindrome(int num) {

        int original_num = num;
        int reversed_num = 0;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            reversed_num = reversed_num * 10 + rem;
            num = num / 10;

        }
        if (reversed_num == original_num) {
            return true;
        }

        return false;
    }
}
