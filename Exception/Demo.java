package Exception;

public class Demo {
    public static void main(String[] args) {
        int a= 5;
        int b=0;
//        try - It is used to specify the block where we should place an exception code.
//        catch - it is used to handle the exception.
//        finally - it is used to execute the necessary code whether there is an exception or not
        try {
            divide(a,b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will always run");
        }

    }
//    throw - it is used to throw the exception explicitly in the code.We cant throw multiple exception at a time.
//    throws - it is used to declare the exception.
//    It is always used with the method signature.We can declare multiple exception at a time
    static int divide(int a , int b) throws ArithmeticException {
        if (b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
