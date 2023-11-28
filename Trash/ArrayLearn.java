package Trash;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayLearn {
    public static void main(String[] args) {
        System.out.println("Learning java");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        null is a literal and cant be assigned to primitive
        int[] roll1 = new int[5]; // By default, int array has default values 0 and for string it is null and for boolean is
//        int faran; // By default, reference variable value is null
        int[] roll2 = {1, 2, 4}; // Still internally java is using new to allocate memory
        String[] name;//Declaration of the array
        name = new String[8]; //Initialisation: Actual memory allocation (in heap memory)


        int[] array_name = new int[10];
//      datatype   ref variable = these all parts in the heap memory - creating the obj in heap
//      compile time = runtime(DMA)
//      Array objects may not be continuous because in java language specification they told that heap objects are not continuous
//      It depends upon jvm
        int[] bottle = new int[3];
        System.out.println(Arrays.toString(bottle));
        System.out.println(bottle[1]); // gives 0 because of int type array
        String[] names = new String[4];
        System.out.println(names[2]); // gives null because of string type array

//      For each loop
//        for(data_type ref_variable : in_array){
//            System.out.println(ref_variable); ref_variable represents the elements of the array
//        }



    }
}