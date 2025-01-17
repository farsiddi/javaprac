package Logic;

public class StringPalindrome {
    public static void main(String[] args) {
        String word = "A man, a plan, a canal, Panama";
        System.out.println(isPalindrome(word));

    }

    static boolean isPalindrome(String str) {

        StringBuilder cleanInput = new StringBuilder();
        char c;
        for (int i = 0; i < str.length() ; i++) {
            c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleanInput.append(Character.toLowerCase(c));
            }
        }
        System.out.println(cleanInput);
        int start = 0;
        int end = cleanInput.length() - 1;
        while (start < end) {

            if (cleanInput.charAt(start) != cleanInput.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;


//        str = str.toLowerCase();
//        for (int i = 0; i < str.length(); i++) {
//            char start = str.charAt(i);
//            char end = str.charAt(str.length() - 1 - i);
//            if (start != end) {
//                return false;
//            }
//        }
//        return true;
    }
}
