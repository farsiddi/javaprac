package AbstractInterface.Section_11.Interface;

public class CaptainAmericaImpl implements SuperHero {
    @Override
    public String usePower() {
        return "CaptainAmerica is using his power.";
    }

    @Override
    public String stopVillain(char c) {
        if (c == 'Y') {
            return "CaptainAmerica stopped the villain.";
        } else {
            return "CaptainAmerica arrest the villain.";
        }
    }
}
