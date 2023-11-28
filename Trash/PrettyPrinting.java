package Trash;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 23742.32443f;
        System.out.printf("Formatted number is: %.2f",a); // Also does the rounding off
        System.out.println();

//        Placeholders
        System.out.printf("Hello my name is %s and i'm from %s","Faran","LKO");
        System.out.println();

        System.out.println('a'+'b'); // character ascii value addition
        System.out.println((char)('a'+3));
        System.out.println(("a"+1));
//        1 is converted into wrapper class Integer: "a" + "1"
        
    }
}
