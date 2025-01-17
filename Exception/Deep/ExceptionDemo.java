package Exception.Deep;


public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("\n Inside main...");
        share();
        System.out.println("\n End of main...");
    }

    private static void share() {
        System.out.println("\n Inside share...");

        HttpSend.send(0, "Hello", "www.google.com");
        System.out.println("\n End of share");
    }
}
