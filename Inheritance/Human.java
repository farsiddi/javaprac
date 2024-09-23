package Inheritance;

public class Human {

    int noOfHands;
    int noOfLegs;

    public  Human(){
        this.noOfHands=2;
        this.noOfLegs=2;
    }

    public Human(int noOfHands,int noOfLegs){
        this.noOfHands=noOfHands;
        this.noOfLegs=noOfLegs;
    }
    public final void greet(){
        System.out.println("Good morning");
    }


}
