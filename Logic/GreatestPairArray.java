package Logic;

//Find the greatest pair from Array.
public class GreatestPairArray {
    public static void main(String[] args) {
        int[] arr = {12,15,34,7,11,14,13,16,35};
        int smallest = 0;
        int a=0;
        int b=0;
        for (int i=0;i<arr.length;i++){
            for (int j =i+1 ; j< arr.length;j++){
                if (arr[i]+arr[j] >=smallest && (i!=j) ){
                    smallest = arr[i]+arr[j];
                    a=arr[i];
                    b=arr[j];
                }
            }
        }
        System.out.println("The greatest sum pair is "+a+" and "+b);
    }
}