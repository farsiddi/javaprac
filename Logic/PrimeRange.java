package Logic;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int lower_limit= sc.nextInt();;
        int higher_limit = sc.nextInt();
        for (int i=lower_limit;i<=higher_limit;i++){
            if (isprime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isprime(int num){
        int count =0;
        for(int i=2;i<num;i++){
            if (num%i==0){
                count =1;
                break;
            }
        }
        if (count==0){
            return true;
        }else{
            return false;
        }
    }
}
