package LambdaStream.section_24.lambda;


public class NewDel<T extends Number> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        NewDel<Number> num = new NewDel<>();
        num.setData(23);
        System.out.println(num.getData());

        num.setData(32.3);
        System.out.println(num.getData());
    }
}
