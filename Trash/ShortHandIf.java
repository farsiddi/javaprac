package Trash;
//Ternary operator

public class ShortHandIf {
    public static void main(String[] args) {
        int n = 10;
        if (n > 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println((n > 10) ? "yes" : "no");
    }
}
