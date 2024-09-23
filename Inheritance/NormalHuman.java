package Inheritance;

public class NormalHuman extends Human {

    String name;

    public NormalHuman() {
        super();
        this.name = "Human";
    }

    public NormalHuman(int noOfHands, int noOfLegs, String name) {
        super(noOfHands, noOfLegs);
        this.name = name;
    }

    @Override
    public String toString() {
        return "NormalHuman{" +
                "name='" + name + '\'' +
                ", noOfHands=" + noOfHands +
                ", noOfLegs=" + noOfLegs +
                '}';
    }

//    public void greet() {
//        System.out.println("Good night");
//    }
}
