package Inheritance;
//- It is useful for code re-usability: reuse attributes and methods of an existing class when you create a new class.

public class Main2 {
    public static void main(String[] args) {
        NormalHuman human1 = new NormalHuman();
        System.out.println(human1.toString());
        NormalHuman human2 = new NormalHuman(3, 4, "Alex");
        System.out.println(human2.toString());
    }
}