package AbstractInterface;

public class Car implements Engine,Brake,Music{
    @Override
    public void brake() {
        System.out.println("I will work as a brake for the car");
    }

    @Override
    public void start() {
        System.out.println("I will start the car");
    }

    @Override
    public void stop() {

        System.out.println("I will stop the car");
    }

    @Override
    public void acc() {
        System.out.println("I will accelerate the car");
    }
}
