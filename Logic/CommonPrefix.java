package Logic;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] names = {"geeksforgeeks", "geek", "geezer"};
//        String[] names = {"flight", "flower", "flock"};
        int smallest_word = smallestString(names).length();
        System.out.println(smallestString(names));
        int arr_len = names.length;
//        for (int i=0;i<arr_len;i++){
//            String name1  = names[i];
//            for (int j = i+1;j<arr_len;j++){
//                String name2 = names[j];
//
//            }
//        }
        StringBuilder ch = new StringBuilder();
        for (int i = 0; i < smallest_word; i++) {
            char curr_ch = names[0].charAt(i);
            for (int j = 1; j < names.length; j++) {
                if (names[j].charAt(i) != curr_ch) {
                    System.out.println(ch);
                    return;
                }
            }
            ch.append(curr_ch);

        }
        System.out.println(ch);

    }

    public static String smallestString(String[] arr) {

        String smalleststr = arr[0];
        for (String str : arr) {
            if (str.length() < smalleststr.length()) {
                smalleststr = str;
            }
        }
        return smalleststr;
    }
}
