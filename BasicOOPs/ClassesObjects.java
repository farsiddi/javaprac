package BasicOOPs;

public class ClassesObjects {

    String className;
    String objectName;

    public ClassesObjects(String className, String objectName) {
        this.className = className;
        this.objectName = objectName;
    }

    public static void main(String[] args) {
        ClassesObjects cb = new ClassesObjects("Class", "Object");
        System.out.println(cb.className);
        System.out.println(cb.objectName);
    }
}
