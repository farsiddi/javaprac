package Logic;
//Find the array pairs whose sum is equal to the given number.

public class ArrayPairSum {
    public static void main(String[] args) {
        int[] arr = {12,15,34,7,11,14,13,16};
        int sum =27;
        int count =0;
//        System.out.println(arr[arr.length-1]);
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i] + arr[j] ==sum && (i!=j) ){
                    count+=1;
                    System.out.println("Pair "+count+" is " +arr[i]+" and "+arr[j]);
                }
            }
        }
    }
}
