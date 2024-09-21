package Exception;

public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 45};
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + exception.getMessage());
        }
    }
}
