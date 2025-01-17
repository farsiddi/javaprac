package Exception.section_14;

// Checked Exception(Compile Time Exception) = Java compiler forces the developer to catch the exception.
//                            Sub classes of Exception classes  but not of the Runtime Exception

//                        THROWABLE is the superclass of all ERRORS and EXCEPTION

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Please enter some value");
        try {
            String str = bufferedReader.readLine();
            inputStreamReader.close();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
//            throw new InputMismatchException();
        }
    }

//    public void readFile() throws IOException {
//        FileReader fileReader = new FileReader("IdeaProjects\\javaprac\\Exception\\Intro.txt");
//    Dont use method type for throwing exception use try catch block to catch a specific type of exception
//    }
}