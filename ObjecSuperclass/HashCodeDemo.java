package ObjecSuperclass;


import java.util.*;

// One way process
// Return an int value which is the hash code of the object.
// Can be Overrriden
// Can be any value within the int range(negative)
public class HashCodeDemo {
    public static void main(String[] args) {

        Peoples people = new Peoples("John", 32, 'M', 23424321);
        Peoples people1 = new Peoples("John", 32, 'M', 23424321);
        System.out.println(people1.hashCode());
        System.out.println(people.hashCode());
//        Above two line will give different hash value because the default implementation of the hashCode() is base on the memory location they are stored
        System.out.println(people.equals(people1));// by default it checks the memory location of two objects
        System.out.println(people == people1); // Created with new keyword so stored at different places = two different objects
        Peoples people2 = people;
        System.out.println(people2 == people); //

//        System.out.println(people.hashCode());

        String str1 = "FB";  // "FB" and "Ea" have the same hash code in Java
        String str2 = "Ea";
        System.out.println("Check");
        System.out.println(str1.hashCode());  // 2236
        System.out.println(str2.hashCode());  // 22364
        System.out.println(str1.equals(str2));  // false

    }

}

class Peoples {
    private String name;
    private int age;
    private char gender;
    private int ssn;

    /**
     * When you override equals(), you define a custom comparison based on object fields rather than memory location.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peoples people = (Peoples) o;
        return age == people.age && gender == people.gender && ssn == people.ssn && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, ssn);
    }

    public Peoples(String name, int age, char gender, int ssn) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

}
