package Logic;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

//        Using for loop
        int[] arr1 = {1,3,7,4,2};
        int len = arr1.length;
        System.out.println(arr1[len/2]);
        for (int i=0;i<arr1.length/2;i++){
            int temp=arr1[i];
            arr1[i]=arr1[len-1-i];
            arr1[len-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr1));

//        Using While loop
        int[] arr2={65,32,73,12,42,29};
        int start=0;
        int end = arr2.length-1;
        while(start<end){
            int temp =arr2[start];
            arr2[start]= arr2[end];
            arr2[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
