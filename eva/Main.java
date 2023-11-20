package eva;

import Polymorphism.Types.Sum;

public class Main {
    public static int Sum(int a , int b){
        return a+b;
    }
    public static int Sum(int a , int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int b = Sum(1,2,3);
        System.out.println(b);
    }
}
