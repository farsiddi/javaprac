package ObjecSuperclass.Clone;

/**
 * In Java, objects are not cloned automatically; assigning one reference to another
 * copies only the reference, not the actual content.
 *
 * <p>To enable cloning, override the {@code clone()} method:</p>
 * <pre>
 * protected native Object clone() throws CloneNotSupportedException;
 * </pre>
 *
 * <p><b>Note:</b> Implement {@code Cloneable} to allow cloning,
 * otherwise {@code CloneNotSupportedException} is thrown.</p>
 *
 * <p>Use a try-catch block or declare {@code throws CloneNotSupportedException}
 * when invoking {@code clone()}.</p>
 */

public class CloneDemoEazy {
    public static void main(String[] args) {
        Car car1 = new Car("Scorpio", 261);
        Car car2 = car1; // You thought it was copying an object
        // but in reality, car2 is pointing to same the object as car1,
        // no new object creation
        System.out.println(car1.getHorsePower() + " " + car2.getHorsePower());
        car2.setHorsePower(999); // changes the horsePower of both the cars because they are pointing to same object
        System.out.println(car1.getHorsePower() + " " + car2.getHorsePower());
        String name = "Alex";
        String name2 = name;
        System.out.println(name + " " + name2);
        name2 = "Carl";
        System.out.println(name + " " + name2);
//         Strings are immutable, so modifying name2 does not change name, instead a "Carl" obj is created in string pool and name2 is pointing to it
        int a = 9999;
        int b = 4343;
        System.out.println(a + " " + b);
        b = 1111;
        System.out.println(a + " " + b);
//       Reassigning b does not affect a, as integers are primitive types (stored independently).
    }
}

class Car {
    private String name;
    private int horsePower;

    public Car(String name, int horsePower) {
        this.name = name;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}