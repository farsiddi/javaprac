package ObjecSuperclass;

public class ImmutableDemo {
    public static void main(String[] args) {
        System.out.println("kenvjb vdv");
        main();
    }

    public static void main() {
        System.out.println("Hello world");

    }
}

class ImmutablePerson {

    private final String name;
    private final int ssnId;

    public ImmutablePerson(String name, int ssnId) {
        this.name = name;
        this.ssnId = ssnId;
    }

    public String getName() {
        return name;
    }

    public int getSsnId() {
        return ssnId;
    }
}
