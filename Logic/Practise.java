package Logic;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int len = arr1.length;
        for (int i = 0;i<len/2;i++){
            int temp = arr1[i];
            arr1[i]=arr1[len-i-1];
            arr1[len-1-i]=temp;


        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2= {5, 6, 7, 8, 9};
        int start=0 ,end=arr2.length-1;
        while(start<end){
            int temp =arr2[start];
            arr2[start]=arr2[end];
            arr2[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
