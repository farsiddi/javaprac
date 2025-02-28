package ObjecSuperclass;

import java.util.Arrays;

/**
 * Below are the guidelines for implementing the {@code equals} method:
 *
 * <ol>
 *   <li><b>Symmetry:</b> The {@code equals} method should be symmetric, meaning if {@code a.equals(b)} is true, then {@code b.equals(a)} should also be true.</li>
 *   <li><b>Reflexivity:</b> The {@code equals} method should be reflexive, meaning {@code a.equals(a)} should always be true.</li>
 *   <li><b>Transitivity:</b> The {@code equals} method should be transitive, meaning if {@code a.equals(b)} is true and {@code b.equals(c)} is true, then {@code a.equals(c)} should also be true.</li>
 *   <li><b>Consistency:</b> The {@code equals} method should provide consistent results over multiple invocations as long as the objects are not modified.</li>
 * </ol>
 * <b>  String str4 = new String("Hello").intern(); // Moves to String Pool</b>
 * <li>.intern() moves str4 to the pool</li>
 */

public class EqualsAndEquals {
    public static void main(String[] args) {
        String a = "Faran";
        String b = "Faran";
//        == Comparator - Pointing to the same object - reference variable is pointing to the same object
//        System.out.println(a==b);  Gives true
//        Explicitly telling to create a new object with same name
        String c = new String("Faran");
//        System.out.println(a==c);  Gives false as it outside the pool
//        When only checking values - .equals
        System.out.println(new int[]{1, 2, 34, 5});
        System.out.println(Arrays.toString(new int[]{1, 2, 34, 5}));
        Integer num = new Integer(56);
        System.out.println(num);
        System.out.println(num.toString());  // toString grey cause internally it is calling the same, and you don't have to write it.


        Peoples people = new Peoples("John", 32, 'M', 23424321);
        Peoples people1 = new Peoples("John", 32, 'M', 23424321);
        System.out.println(people1.hashCode());
        System.out.println(people.hashCode());
//        Above two line will give different hash value because the default implementation of the hashCode() is base on the memory location they are stored
        System.out.println(people.equals(people1));// by default it checks the memory location of two objects
        System.out.println(people == people1); // Created with new keyword so stored at different places = two different objects
        Peoples people2 = people;
        System.out.println(people2 == people); //
//        String name1 = "Alex";
//        String name2 = "Alex";
//        System.out.println(name2 == name1 + " " + name1.equals(name2));// false
//        treated as  - name2 == ((name1) + "") + (name1.equals(name2)) // in java The + operator in Java evaluates from left to right.
//                        name2 == Alex + true  // rest treated as string thatswhy String conactenation
//                        name2 == Alextrue  => Gives false
    }
//    equal method -  Refers to the same exact memory location

}


class People {
    private String name;
    private int age;
    private char gender;
    private int ssn;

    public People(String name, int age, char gender, int ssn) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ssn = ssn;
    }

    public People() {
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

