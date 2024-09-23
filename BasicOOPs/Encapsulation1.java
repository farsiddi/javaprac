package BasicOOPs;
//The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
//
//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable
public class Encapsulation1 {
    private String name;
    private String city;
    private int pincode;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Encapsulation1{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
