package BasicOOPs;

public class Encapsulation2 {
    public static void main(String[] args) {
        Encapsulation1 myObj = new Encapsulation1();
        myObj.setName("Alex");
        myObj.setCity("London");
        myObj.setPincode(12345);
        System.out.println(myObj.toString());
    }
}
