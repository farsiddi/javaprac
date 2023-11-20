package AbstractInterface;

public class PetrolEngine implements  Engine{
    @Override
    public void acc() {
        System.out.println("Petrol engine start");
    }
    public void start(){
        System.out.println("Petrol engine start");
    }
    public void stop(){
        System.out.println("Petrol engine stop");
    }
}
