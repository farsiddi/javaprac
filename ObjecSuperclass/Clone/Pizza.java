package ObjecSuperclass.Clone;
//Clone has protected access.
//Steps
//        1-Implement Cloneable interface
//        2-Override the clone function
//        3- Call the clone function
//        4- Add throws CloneNotSupportedException


import java.util.Objects;

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


    }
}