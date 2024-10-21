package Logic;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int value = 1;
        for (int i = n; i >= 1; i--) {
            value = value*i;
        }
//        System.out.println(value);
//        int[] aa1 = {1,2,4,56,7};
//        for (int v  : aa1){
//            System.out.println(v);
//        }
//        System.out.println(Check(n));
        System.out.println(value);



    }
    static int Check(int num){
//        System.out.println("function is running" +num);
        if(num==0){
            return 1;
        }
        num = num * Check(num -1);
        return num;



    }
}
