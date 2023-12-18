package Logic;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count =0;

        for(int i =2;i<num;i++){
            if (num%i==0){

                count=1;
                break;
            }
        }
        if (count==1){
            System.out.println("Not prime");
        }else {
            System.out.println("isprime");
        }
    }
}