package Generics.Section_19;

public class GenericsDemo<A, B> {
    private A first;
    private B second;

    public GenericsDemo(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public static void main(String[] args) {
        GenericsDemo<Integer, String> gd = new GenericsDemo<Integer, String>(1, "Alex");
        System.out.println(gd.getFirst() + " " + gd.getSecond()); // No casting needed in here
    }
}
