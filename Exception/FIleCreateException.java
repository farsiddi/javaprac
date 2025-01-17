package Exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FIleCreateException {

    public static void main(String[] args) {
        createFile("file.txt");
    }

    private static void createFile(String filename) {
        PrintWriter outputFile = null;
        try {
            outputFile = new PrintWriter(new FileWriter(filename));

        } catch (IOException e) {
            System.err.println("Caught an exception" + e.getMessage());
//            e.printStackTrace();
//            createFile("Copy " + filename); Just incase if you really need a file then it will create it with recursion
        } finally {
            if (outputFile != null) {
                outputFile.close();
                System.out.println("The print writer is closed");
            } else {
                System.out.println("Print is not opened");
            }
        }
        System.out.println("This comes after we try to create a file");
    }
//Dont need finally block because Java provides try-with-resources to automatically manage resources like FileWriter and PrintWriter.
//    private static void createFile(String filename) {
//        try (PrintWriter outputFile = new PrintWriter(new FileWriter(filename))) {
//
//        } catch (IOException e) {
//            System.err.println("Caught an exception" + e.getMessage());
////            e.printStackTrace();
////            createFile("Copy " + filename); Just incase if you really need a file then it will create it with recursion
//        }
//        System.out.println("This comes after we try to create a file");
//    }
}