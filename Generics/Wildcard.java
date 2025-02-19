package Generics;

import java.util.ArrayList;
import java.util.List;

//the wildcard? is a special kind of type argument that controls the type safety of the use of generic types
public class Wildcard<T extends Number> {
    //    Here T should be either Number class or its subclasses
//    AtomicInteger, AtomicLong, BigDecimal, BigInteger, Byte, Double, DoubleAccumulator,
//    DoubleAdder, Float, Integer, Long, LongAccumulator, LongAdder, Short
    private T data;

    public void set(T data) {
        this.data = data;
    }

    public T get() {
        return data;
    }

    public static void main(String[] args) {
        Wildcard<Number> check = new Wildcard<>();
        check.set(21);  //We can provide int -  It's a subclass of Number
//        int a = (int)check.get();
        check.set(83.2);  //We can provide float - It's a subclass of Number
//        double b = (double)check.get();
//        check.set("Faran");   But cant provide String

//        System.out.println(a);
//        System.out.println(b);
        System.out.println(check.get());
        List<Number> lst = new ArrayList<>();
        lst.add(212);
        lst.add(3.34);
//        lst.add("String") // not possible
    }
}
