package AbstractInterface.Section_11.Interface;

/*
A marker interface is an empty interface (i.e., it has no methods or fields).
It is used to indicate or "mark" a class as having a special property or behavior, which is recognized by the Java runtime or a framework.
Example  - Serializable (Marks a class as serializable (i.e., its objects can be converted into a byte stream).)
           Cloneable (Marks a class as allowing cloning via Object.clone().
           Advantages -
           Provide metadata to the JVM or frameworks
           Helps Java runtime or third-party libraries decide how to handle objects.
           Enforce certain behaviors without defining methods(Example: Serializable ensures that only marked objects can be serialized.)

* */
public interface MarkerInterface {
//            Empty Interface (No Methods or Fields)
}
