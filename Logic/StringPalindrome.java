package Logic;

public class StringPalindrome {
    public static void main(String[] args) {
        String word = "pip";
        System.out.println(isPalindrome(word));

    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i=0;i<str.length();i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end){
                return false;
            }
        }
        return true;
    }
}
