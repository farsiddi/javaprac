package Polymorphism.Types;


public class Result {
//    Static methods cannot be overriden because if the parent class have static methods then they will always execute no matter what from which object they area called
//    Result is the parent class and Good,Average and Poor student are the child class
//    Having the same method name result but each having different body
//    When object of the child class is created then the result() method of the parent class is overridden
//    By the child class result method


    //    @Override =  Indicates that a method declaration is intended to override a method declaration in a supertype.
    void result() {
        System.out.println("Student's result");
    }
//    Runtime polymorphism or  DYNAMIC polymorphism
//    same access modifiers  same method name but different body
//    Achieved through method overriding


}
