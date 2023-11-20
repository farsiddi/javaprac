package Logic;

import java.util.Scanner;

//      0    1   1   2   3   5   8   13   21   34
//      1    2   3   4   5   6   7   8     9   10
public class FiboAtIndex {
    public static void main(String[] args) {
        int a =0;
        int b=1;
        int temp=0;
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        for(int i=3;i<=index;i++){
            temp = a + b;
            a=b;
            b=temp;
        }


        System.out.println(temp);
    }
}
