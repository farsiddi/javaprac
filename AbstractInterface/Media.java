package AbstractInterface;

public class Media implements Music{
    @Override
    public void start() {
        System.out.println("Start the music");
    }

    @Override
    public void stop() {
        System.out.println("Stop the music");
    }
}
