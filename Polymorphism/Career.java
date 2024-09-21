package Polymorphism;

public class    Career {
    int marks;
    String name;
    public Career(){

        System.out.println("Its is your choice");
    }

    public Career(int marks) {
        this.marks = 85;
        this.name="Farhan";
    }

    public Career(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

