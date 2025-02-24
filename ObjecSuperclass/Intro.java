package ObjecSuperclass;

/**
 * The {@code Object} class is present in the {@code java.lang} package. Every class in Java is directly or indirectly derived from the {@code Object} class.
 * <ul>
 *   <li>If a class does not extend any other class, then it is a direct child class of {@code Object}, and if it extends another class, then it is indirectly derived.</li>
 *   <li>Therefore, the {@code Object} class methods are available to all Java classes.</li>
 *   <li>Hence, the {@code Object} class acts as the root of the inheritance hierarchy in any Java program.</li>
 *   <li>The {@code Object} class is the root of the class hierarchy. Every class has {@code Object} as a superclass.</li>
 *   <li>All objects, including arrays, implement the methods of this class.</li>
 * </ul>
 *
 * <p>The {@code Object} class provides <b>nine</b> methods that all Java classes can use. These methods fall into two categories:</p>
 *
 * <h2>🔹 Final Methods</h2>
 * <p>The first category includes the following methods. These methods cannot be overridden in subclasses:</p>
 * <ul>
 *   <li>{@code getClass()}</li>
 *   <li>{@code notify()}</li>
 *   <li>{@code notifyAll()}</li>
 *   <li>{@code wait()} (overloaded methods)</li>
 * </ul>
 *
 * <h2>🔹 Non-Final Methods</h2>
 * <p>The second category includes the following methods. These methods can be overridden in subclasses:</p>
 * <ul>
 *   <li>{@code toString()}</li>
 *   <li>{@code equals()}</li>
 *   <li>{@code hashCode()}</li>
 *   <li>{@code clone()}</li>
 *   <li>{@code finalize()}</li>
 * </ul>
 */

//  Super class variable = sub class -> Upcasting
public class Intro {
    public static void main(String[] args) {

//        Animal animal = new Dog();
////        animal.bark();
//        if (animal instanceof Dog){
//            Dog dog = (Dog) animal;
//            dog.bark();
//        }
//        animal.sound();

    }
}
//class Animal{
//    void sound(){
//        System.out.println("Sound from animal");
//    }
//
//}
//class Dog extends  Animal{
//
//    void bark() {
//        System.out.println("dog barks");
//    }
//}
