package AbstractInterface.AbstractAndInterface;

public class Fun extends Abstractt implements Interface {
    @Override
    public void stitch() {

    }

    @Override
    void mute() {

    }

    public static void main(String[] args) {
        Fun fm = new Fun();
        fm.greet();
        fm.mute();
        fm.stitch();
    }
}
