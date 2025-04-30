package Logic;

import java.lang.reflect.Field;

public class AccessPrivateDemo {

    private String name = "Alex";

    public static void main(String[] args) throws Exception {
        AccessPrivateDemo accessPrivateDemo = new AccessPrivateDemo();

        Field field = AccessPrivateDemo.class.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(accessPrivateDemo));
        field.set(accessPrivateDemo, "Aaron");
        System.out.println(field.get(accessPrivateDemo));
    }
}
