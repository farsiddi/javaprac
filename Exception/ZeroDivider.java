package Exception;

public class ZeroDivider extends Exception {
    public ZeroDivider(Exception exception) {

        super(exception);
    }

    public ZeroDivider(String message) {
        super(message);
    }
}
