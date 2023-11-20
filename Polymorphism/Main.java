package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Square square = new Square();
        Triangle triangle = new Triangle();
        shape.area();
        square.area();
        triangle.area();
//        checks if it is an object(square) of a subclass
        System.out.println(square instanceof Shapes);
        System.out.println(square.getClass());

//        Career stu = new Child1();
//        stu.Career();
        Child1 stu = new Child1();
        System.out.println(stu.name);


    }
}
