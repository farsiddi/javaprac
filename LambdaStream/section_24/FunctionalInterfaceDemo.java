package LambdaStream.section_24;

// Functional Interface - an interface which have only one abstract method(SAM - single abstract method) .Can have multiple static and default method
// Builtin funtional - supplier , consumer , predicate , unary operator ,
// Key Benefit	Cleaner code, less boilerplate, improved readability.
// Use Cases	Streams API, Threading, Callbacks, Event Handling.

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void walk();

    static void talk() {
        System.out.println("hello");
    }
}

