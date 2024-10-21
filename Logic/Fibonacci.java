package Logic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a =0;
        int  b=1;
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.print(a+" "+b);
        int temp;
        for (int i =0;i<c-2;i++){
            temp = a+b;
            a=b;
            b=temp;
            System.out.print(" "+temp);
        }
    }
}