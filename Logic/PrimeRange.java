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

    public static class IntegerToRoman {
        final static int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final static String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        public static String intToRoman(int N) {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; N > 0; i++)
                while (N >= val[i]) {
                    ans.append(rom[i]);
                    N -= val[i];
                }
            return ans.toString();
        }

        public static void main(String[] args) {
            int a = 18;
            System.out.println(intToRoman(a));
        }
    }
}
