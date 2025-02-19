package AbstractInterface.Section_11.Interface;

public interface SuperHero {

    String USERNAME_HERO = "Superman"; //Constants in interfaces are implicitly public, static, and final.

    public String usePower();

    /*
     * Y = kill the villain
     * N = arrest the villain
     * */
    public String stopVillain(char c);

    /**
     * It will not throw any error in its implementaion classes as it is a default method and implementation classes may or may not use this or can provide its own implementaion
     */
    default String cheer() {
        return "You can do it";
    }

    private static void method1() {
        System.out.println("This is mth");
    }

}
