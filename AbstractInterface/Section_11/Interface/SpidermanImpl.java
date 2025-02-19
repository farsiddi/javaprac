package AbstractInterface.Section_11.Interface;

public class SpidermanImpl implements SuperHero {
    @Override
    public String usePower() {
        //        System.out.println(SuperHero.USERNAME_HERO);
        return "Spriderman is using his power.";
    }

    @Override
    public String stopVillain(char c) {
        if (c == 'Y') {
            return "Spriderman stopped the villain.";
        } else {
            return "Spriderman arrest the villain.";
        }
    }
}
