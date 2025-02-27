package AbstractInterface.Section_11.Interface;

// It provides a to define a contract that a class must follow in order to implement a certain set of behaviours
//It defines a the method that a class must implement but does not provide any implementaion details for those methods.
// Specifies - Methods Signature | Return Type | Parameter Type
// Promotes consistency by have same parameter and return type
//Contains - Static fiels | Abstract methods | Default(from JAVA 8) ,Static Methods(from JAVA 8) , Private (from JAVA 9)
//One interface can extend another interface(not implement)
// An interface  declaration is implicitly abstract no need to mention it
// All methods are implicitly public(can be default, no other access modifier)
public interface Intro {
//    public static String final USERNAME_HERO = "Superman";
//fields in interfaces are implicitly public, static, and final. You don't need to (and shouldn't) use final explicitly.

    String USERNAME_HERO = "Superman"; //Fields in interfaces are implicitly public, static, and final.

    //    Interface fields are always but their accessibility depends on the interface's scope.Ex - if interface is having package level scope then its field wont be accessible from outside the package even if the fields are public themselves
    //String name; will throw error because it is not initilized (also variables should be all cap)
    public String usePower();

    /*
     * Y = kill the  villain
     * N = arrest the villain
     * */
    public String stopVillain(char c) throws Exception;

    //    Abstract methods in an interface cannot be declared final because then that methods cannot be overriden
//    Why default methods were introduced in JAVA 8?
//    A default method in Java is a method inside an interface that has a body (implementation). It allows interfaces to provide concrete methods without breaking existing implementing classes.

    /**
     * Suppose that after many years there is a new abstract method in this interface , it will start to throw error in all the implementaion classes
     * It is hard to make in all the implemetation classes
     * So to counter this , default methods were introduced
     * If make a default method(they have some sort of body) in an interface then its implementation  have 3 choices -
     * 1- to completely ignore the changes(which was eralier not possible in abstract method because we need to provide its impl in the implementation classes)
     * 2- use the default body of the interface
     * 3- provide its own implementation
     */
//    Default methods are allowed only in interfaces, not in classes.
//    they cant be static or abstract
    default String cheers() {
        return "You can do it";
    }

    static String commonCharacter() {
        return "Superhuman abilities, sacrifice and leaders";
    }
//    Utility or Helper Methods for Interface-related Operations
//    public static void main(String[] args) {
//        System.out.println("Hello there");
//    }

}
/**
 * Advantages
 * Java does not support multiple inheritance with classes, but interfaces allow a class to implement multiple interfaces, enabling multiple inheritance-like behavior.
 * Interfaces define what a class should do but not how it should do it, promoting abstraction and reducing implementation dependencies.
 * Since classes depend on interfaces rather than concrete implementations, it makes the system more modular and easier to maintain.
 * Different classes can implement the same interface, ensuring reusable code and standard behavior across different implementations.
 * Interfaces define a contract that implementing classes must follow, ensuring consistency in behavior across multiple implementations.
 */