package BasicOOPs;

//With method overloading, multiple methods can have the same name(can have same methods signature also) with different parameters:
// Compile time
public class Overloading {
    public static void main(String[] args) {
        System.out.println(calc(1, 2));
        System.out.println();
        System.out.println(calc(1, 2, 3));
        System.out.println(calc(1, 2, 3, 4));
       
    }

    //Each method have the same name but different parameter so that are called differently
    public static int calc(int n, int m) {
        return n + m;
    }

    public static int calc(int n, double m) {
        return (int) (n + m);
    }

    public static int calc(int n, int m, int l) {
        return n + m + l;
    }

    public static int calc(int n, int m, int l, int o) {
        return n + m + l + o;
    }

}
