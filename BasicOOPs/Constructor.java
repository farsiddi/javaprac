package BasicOOPs;

//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object
// of a class is created. It can be used to set initial values for object attributes.
// Must have sam name as the class name.Cannot have return type of any sort.

public class Constructor {
    int n;
    int m;

    public static void main(String[] args) {

        Constructor ct = new Constructor(1, 2);
        System.out.println(ct.m + ct.n);

        Constructor ctt = new Constructor();
        System.out.println(ctt.m + ctt.n);
    }

    public Constructor(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public Constructor() {
        n = 99;
        m = 11;
    }
}
