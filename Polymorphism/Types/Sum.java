package Polymorphism.Types;

public class Sum {
    int sum(int a , int b){
        return a+b;
    }
    int sum(int a , int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
//        Compile time polymorphism STATIC polymorphism
//        Achieve through method overloading
//        it determines which constructor to call at the compile time
        Sum obj = new Sum();
        obj.sum(7,3);
        obj.sum(8,5,9);
    }


}
