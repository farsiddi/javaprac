package AbstractInterface.Section_11.Interface.MultipleInheritance;

public interface SuperHero extends Hero, Person {
    String USERNAME_HERO = "Superman";

    public String usePower();

    public String stopVillain(char c);

    default String cheer() {
        return "You can do it";
    }

    private static void method1() {
        System.out.println("This is mth");
    }

    //    This will help the compiler in case it is having the same method name
//    @Override
//    void walk();

//    If there is a default method present then you can override the same method

//    @Override
//    default void walk() {
//        Hero.super.walk(); // invoke the super default method
//    }



}
