package ObjecSuperclass.Clone;

import java.util.Objects;

/**
 * Cloning in Java requires explicit implementation since the {@code clone()} method
 * * has protected access in {@code Object}.
 *
 * <p><b>Steps to enable cloning:</b></p>
 * <ol>
 *   <li>Implement the {@code Cloneable} interface.</li>
 *   <li>Override the {@code clone()} method.</li>
 *   <li>Call the {@code clone()} method to create object copies.</li>
 *   <li>Declare {@code throws CloneNotSupportedException} in the method signature.</li>
 * </ol>
 */
public class Pizza implements Cloneable {
    private String pizzaName;
    private String pizzaSize;
    private int pizzaPrice;

    public Pizza(String pizzaName, String pizzaSize) {
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.pizzaPrice = calculatePrice();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return pizzaPrice == pizza.pizzaPrice && Objects.equals(pizzaName, pizza.pizzaName) && Objects.equals(pizzaSize, pizza.pizzaSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzaName, pizzaSize, pizzaPrice);
    }

    private int calculatePrice() {
        switch (pizzaSize.toLowerCase()) {
            case ("small"):
                return 200;
            case ("large"):
                return 300;
            case ("medium"):
                return 250;
            default:
                System.out.println("Use large , medium or small as pizza size");
                return 0;
        }


    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Pizza firstOrder = new Pizza("Corn", "LArge");
        System.out.println(firstOrder.pizzaName);
        System.out.println(firstOrder.pizzaSize);
        System.out.println(firstOrder.pizzaPrice);

        Pizza secondOrder = (Pizza) firstOrder.clone();
        System.out.println(secondOrder.pizzaName);
        System.out.println(secondOrder.pizzaSize);
        System.out.println(secondOrder.pizzaPrice);
//        the clone() method does create a completely new object with a different hashCode value, which means it's in a separate memory location.
        System.out.println(firstOrder.equals(secondOrder));
        System.out.println(firstOrder.hashCode() + "  - " + secondOrder.hashCode());
        System.out.println(firstOrder == secondOrder); // False
        System.out.println(firstOrder.equals(secondOrder)); // True - since equals methods is overriden so it compares the fields
//        Same hashCode() does NOT mean same object.
//        Two objects can have the same hashCode() if they have identical field values.


    }
}