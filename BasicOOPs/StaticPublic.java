package BasicOOPs;

public class StaticPublic {

    static void myName() {
        System.out.println("My name is Alex");
    }

    public void myAge() {
        System.out.println("My age is 29");
    }

    public static void main(String[] args) {
        myName();   // called directly without object because of being static
//        myAge();    Cannot access because its non-static and needs object to call
        StaticPublic myObj = new StaticPublic();
        myObj.myAge();
    }
}
