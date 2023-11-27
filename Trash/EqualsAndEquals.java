public class EqualsAndEquals {
    public static void main(String[] args) {
        String a = "Faran";
        String b = "Faran";
//        == Comparator - Pointing to the same object - reference variable is pointing to the same object
//        System.out.println(a==b);  Gives true
//        Explicitly telling to create a new object with same name
        String c = new String("Faran");
//        System.out.println(a==c);  Gives false as it outside the pool

//        When only checking values - .equals


    }
}
