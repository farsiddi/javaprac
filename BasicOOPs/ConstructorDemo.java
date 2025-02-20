package BasicOOPs;

/**
 * A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object
 * of a class is created. It can be used to set initial values for object attributes.
 * the constructor of a class does not need to have the same scope as the class.
 * Must have sam name as the class name.Cannot have return type of any sort.
 * The constructor's access modifier can be more restrictive than the class but not more permissive than the class.
 */
public class ConstructorDemo {
    int n;
    int m;

    public static void main(String[] args) {

        ConstructorDemo ct = new ConstructorDemo(1, 2);
        System.out.println(ct.m + ct.n);

        ConstructorDemo ctt = new ConstructorDemo();
        System.out.println(ctt.m + ctt.n);
    }

    public ConstructorDemo(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public ConstructorDemo() {
        n = 99;
        m = 11;
    }
}
