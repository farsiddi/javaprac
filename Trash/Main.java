

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        name is pointing to the object in the string pool
//        String pool is the separate memory structure inside the heap
       String name = "Farhan Siddiqui";
        System.out.println(name);

//        a and b is pointing to same object in heap
        String a = "Karan";
        String b = "karan";
        b="Rohan";
        System.out.println(a);
        System.out.println(b);

    }
}