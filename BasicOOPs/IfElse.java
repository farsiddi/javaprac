package BasicOOPs;

//Shorthand or ternary
//    condition1 ? trueValue1 : (condition2 ? trueValue2 : falseValue);
//    String grade = (score >= 90) ? "A" :
//                       (score >= 80) ? "B" :
//                       (score >= 70) ? "C" :
//                       (score >= 60) ? "D" : "F";
public class IfElse {
    public static void main(String[] args) {
        int n = 10;
        if (n > 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println((n > 10) ? "yes" : "no");
    }
}
