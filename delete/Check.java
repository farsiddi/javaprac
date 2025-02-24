package delete;

import java.util.Objects;

public class Check {
    public static void main(String[] args) {
        People people1 = new People(23, "Alex", 'M');
        People people2 = new People(32, "Carl", 'M');
        People people3 = new People(55, "Mike", 'M');
        People people4 = new People(23, "Alex", 'M');
        System.out.println(people1.equals(people4));
    }


}

class People {

    private int age;
    private String name;
    private char gender;

    public People(int age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && gender == people.gender && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, gender);
    }

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
