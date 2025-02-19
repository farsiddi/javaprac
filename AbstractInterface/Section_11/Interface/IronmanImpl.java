package AbstractInterface.Section_11.Interface;

public class IronmanImpl implements SuperHero {


    @Override
    public String usePower() {
//        System.out.println(SuperHero.USERNAME_HERO);

        return "Ironman is using his power.";
    }
//      You can mention your own body or use the default methos's body
//    @Override
//    public String cheer() {
//        return SuperHero.super.cheer();
//    }

    @Override
    public String stopVillain(char c) {
        if (c == 'Y' || c == 'y') {
//            System.out.println(SuperHero.USERNAME_HERO); we can do this with interfaces, we can access the field this way
            return "Ironman stopped the villain.";
        } else {
            return "Ironman arrest the villain.";
        }
    }

    public void method1() {
        System.out.println("Thijnfnrs is methdo1");
    }


}