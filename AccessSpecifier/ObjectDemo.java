package AccessSpecifier;

public class ObjectDemo {
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo();
        ObjectDemo objw = new ObjectDemo();
        System.out.println(obj);
        System.out.println(obj.hashCode());
        System.out.println(objw.hashCode());
    }
}
