package ObjecSuperclass;

import java.util.*;


public class ToStringDemo {
    public static void main(String[] args) {

        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human(21, "Alex", "Bangalore", 'M'));
        humanList.add(new Human(53, "Meghan", "London", 'F'));
        humanList.add(new Human(42, "Carl", "Tripura", 'M'));
        humanList.add(new Human(15, "Michael", "Kochi", 'M'));
        humanList.add(new Human(15, "Michael", "Kochi", 'M'));
//        Default behaviour - getClass().getName() + '@' + Integer.toHexString(hashCode())
        System.out.println(humanList); // by default invoking toString() no need to mention
        System.out.println(humanList.get(3));
        Set<Human> humanSet = new HashSet<>(humanList);
        System.out.println("printing set");
        System.out.println(humanSet);
//        Order is different because a set doesn't maintain the insertion order.


    }
}

class Human {
    private int id;
    private String name;
    private String city;
    private Character gender;

    @Override
    public String toString() {
        return "Human{" + "id=" + id + ", name='" + name + '\'' + ", city='" + city + '\'' + ", gender=" + gender + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id && Objects.equals(name, human.name) && Objects.equals(city, human.city) && Objects.equals(gender, human.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, gender);
    }

    public Human(int id, String name, String city, Character gender) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
}
