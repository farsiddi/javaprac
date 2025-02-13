package Polymorphism.Types;
// Static methods cannot be overriden
import Polymorphism.Career;

public class Main {

//    what is being accessed does not depend on the object type(right side) it depends upon the reference type(left side)
    public static void main(String[] args) {
        Result result = new Result();
        Result result1 = new Poorstudent();
//        What it is able to access is defined by the reference type(left side)
//        which one its able to access is defined by the object type(right side)
//        Parent  obj = new Child();
//        Hence, which method will be accessed wil depend upon Child();
//        This is known as overriding
//        Java determines this using - Dynamic method dispatch
        Goodstudent result2 = new Goodstudent();
        result1.result();

    }
}
