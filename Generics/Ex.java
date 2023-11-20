package Generics;

public class Ex<T> {
    private T data;
    public T getEx(){
        return data;
    }
    public void setEx(T data){
        this.data = data;
    }

    public static void main(String[] args) {
        Ex<String> letter = new Ex<>();
        letter.setEx("Hello");
        String greet = letter.getEx();
        System.out.println(greet);

        Ex<Integer> num = new Ex<>();
        num.setEx(21);
        System.out.println(num.getEx());
//        Used same code but with the different data types.
    }
}
