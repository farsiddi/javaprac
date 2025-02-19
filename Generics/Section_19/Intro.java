package Generics.Section_19;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

//It allows us to create reusable classes and methods that can work with different data types(work with any data type)


public class Intro {

    private Object first;
    private Object secoond;

    public Intro(Object first, Object secoond) {
        this.first = first;
        this.secoond = secoond;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecoond() {
        return secoond;
    }

    public void setSecoond(Object secoond) {
        this.secoond = secoond;
    }

    public static void main(String[] args) {
        Intro integerStringPair = new Intro(213, "Alex");
//        int myInt =  integerStringPair.getFirst(); throws error because return an object
        int myInt = (Integer) integerStringPair.getFirst(); // reuqires casting everytime
        String myString = (String) integerStringPair.getSecoond(); // same here requires casting
        System.out.println(myString + " " + myInt);

//        This is the drawback that it gives no type saftey
//        Requires casting everytime
//        if in between we use another types it throws ClassCastException
//        Because of above reasons Generics were introduced
//        Also compiler will not be happy because we havent define any datatype in the angle<>, so it doesnt know which data type will be there
//        And when we do feine the data types in the <> compiler will get to know which data type will be present there
    }
/**
 * Advantages of Java Generics

 Type-safety
 Generics allow us to store only a single type of object and prevent the storage of other types. In contrast, without Generics, we can store any type of object, regardless of its data type.

 No Type casting required & Code Reusability.
 Using Generics we can eliminate the need for explicit type casting while working with collections etc.
 With the help of generics, we can write code that will work with different types of objects.

 Compile-Time Check
 Using Generics in Java, we can check for errors at compile time, which helps in preventing potential problems that may occur at runtime. As a best practice, it is recommended to handle errors and resolve them during the compilation phase rather than at runtime, in order to minimize the risk of unexpected errors or behavior in the program.
 * */
}
