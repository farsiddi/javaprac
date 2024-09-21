package Trash;

import java.util.Arrays;

public class Array_2 {
    public static void main(String[] args) {
        int[]  nums  = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change_element(nums); // original array will change because both are pointing to the same array
        System.out.println(Arrays.toString(nums));

//        String dd = "Farhan";
//        System.out.println(dd.charAt(2));
    }
    static void change_element(int[] arr){ // arr is pointing to the same array which nums is pointing
        arr[1] = 99;


    }
}