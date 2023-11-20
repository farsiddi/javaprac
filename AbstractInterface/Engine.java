package AbstractInterface;

public interface Engine {
/*
    Static methods in interface should always have the body because they cant be overridden
    Static methods are called via  their class name
    static void fun(){

    }
*/

    static  final int price =78;
//    By default, variables are final and static thatswhy static and final are grey
    void start();
    void stop();
    void acc();

}
