package Trash;

public class GatSat {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GatSat chec = new GatSat();
        chec.setAge(23);
        System.out.println(chec.getAge());
        chec.setName("Faran");
        System.out.println(chec.getName());
    }
}
