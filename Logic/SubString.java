package Logic;

public class SubString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1.substring(0, 1).toUpperCase() + s1.substring(1) + s2.substring(0, 1).toUpperCase() + s2.substring(1);
        System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1) + " " + s2.substring(0, 1).toUpperCase() + s2.substring(1));
    }
}
