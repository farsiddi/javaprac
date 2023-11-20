package AbstractInterface;

public class NiceCar {
    private Engine engine;
    private Music player = new Media();

    public NiceCar() {
        engine = new PetrolEngine();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startmusic(){
        player.start();
    }
    public void stopmusic(){
        player.start();
    }
    public void UpgradeEngine(){
        this.engine=new ElectricEngine();
    }

}
