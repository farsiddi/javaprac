package Logic;

public class StringReverse {
    public static void main(String[] args) {
        String name = "Farhan";
        int len = name.length();
        StringBuilder new_name = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
//            char c = name.charAt(i);
//            new_name.append(c);
            char c = name.charAt(i);
            new_name.append(c);
            
        }
        System.out.println(new_name);
    }
}
