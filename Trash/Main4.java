package Trash;

public class Main4 {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try{
            int c = a/b;
        }catch (Exception e){
//            System.out.println("Do not divide by zero");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will always run regardless of exception is there or not");
        }
        System.out.println("Hello");
    }
}
