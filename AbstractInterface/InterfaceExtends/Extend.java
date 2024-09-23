package AbstractInterface.InterfaceExtends;

public class Extend implements B {

//    We have to add implement both the methods

    @Override
    public void fun() {

    }

    @Override
    public void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Extend et = new Extend();
        et.greet();
    }
}
