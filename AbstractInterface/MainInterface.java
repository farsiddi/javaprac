package AbstractInterface;

public class MainInterface {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.stop();
//
//        Music music = new Car();
//        music.stop();
        NiceCar car = new NiceCar();
        car.start();
        car.stop();
        car.startmusic();
        car.startmusic();

//        Without creating a new object we were able to change the method accessed
        car.UpgradeEngine();
        car.start();
        car.stop();

    }

}
