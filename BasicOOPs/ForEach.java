package BasicOOPs;
//The break statement can also be used to jump out of a loop.
//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
//        for (type variableName : arrayName) {
//  // code block to be executed
//}

public class ForEach {

    public static void main(String[] args) {

        String[] cars = {"Alto", "E-class", "800"};
        for (String n : cars) {
            System.out.println(n);
        }
    }
}
