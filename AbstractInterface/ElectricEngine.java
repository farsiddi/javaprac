package AbstractInterface;

public class ElectricEngine implements Engine{
    public void start(){
        System.out.println("Electric engine start");
    }
    public void acc(){
        System.out.println("Electric engine accelerate");
    }
    public void stop(){
        System.out.println("Electric engine stop");
    }

}