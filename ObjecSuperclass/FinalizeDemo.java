package ObjecSuperclass;

/**
 * The {@code finalize()} method in Java was used for resource cleanup before an object
 * is discarded by the garbage collector. However, it is unreliable since execution
 * is not guaranteed.
 *
 * <p>Declared in {@code Object} class:</p>
 * <pre>
 * protected void finalize() throws Throwable { }
 * </pre>
 *
 * <p><b>Note:</b> Deprecated since Java 9. Prefer alternatives like:</p>
 * <ul>
 *   <li>Try-with-resources ({@code AutoCloseable})</li>
 *   <li>Try-finally blocks</li>
 * </ul>
 */

public class FinalizeDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
            new Person();
//            Not even one it invoked or not invoked not gurantee thatswhy it is not recommended(for 10000)
        }
    }


}
