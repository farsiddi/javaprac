package Cloning;

public class Human implements Cloneable {
//    implements cloneable tells jvm that we are using clone() int the type of object human and if not written
//    Invoking Object's clone method on an instance that does not implement the Cloneable interface
//    results in the exception CloneNotSupportedException being thrown.
    String name ;
    int age;
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
    public  Human(String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Human(Human other){
        this.age=other.age;
        this.name= other.name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
//    It does shallow copy


    public static void main(String[] args) throws CloneNotSupportedException {
        Human faran = new Human("Faran",32);
//        It takes a lot of processing time because using a "new" keyword.
        Human rohan = new Human(faran);
        System.out.println(faran.name);
        System.out.println(rohan.name);
        System.out.println();
        System.out.println();
        rohan.age= 243;
        rohan.name = "faran";
        System.out.println(faran.name);
        System.out.println(rohan.name);

        System.out.println(rohan.age);
        System.out.println(faran.age);

        Human faran2 = (Human) faran.clone();
        System.out.println(faran2.name);
        System.out.println(faran2.age);
        System.out.println(faran2);
        faran2.name="rohan";
        System.out.println(faran.name);

        faran2.age = 54;
        System.out.println(faran.age);
        System.out.println(faran2.age);

    }
}
