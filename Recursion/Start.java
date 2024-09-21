package Recursion;

//Recursion - function calling itself
// It helps us in bigger ,complex problems in a simple way
// Space complexity is not constant because of recursion calls
public class Start {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        int i = 0;
//        while (i < 5) {
//            message();
//            i++;
//        }
        printForward(1);
        System.out.println("hello");
        printBackward(5);

    }

    //    static void message() {
//        System.out.println("My name is dell");
//    }
    static void printForward(int n) {
        if (n == 5) {
//            Base condition
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printForward(n + 1); // when there is a last statement in the function call then it is called tail recursion
    }

    static void printBackward(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printBackward(n - 1);
    }

}

// Breaking problem into smaller problem
// Write the recurrence relation
//Visualize the recursive tree
