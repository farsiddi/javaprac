package Comparing.NewDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This interface imposes a total ordering on the objects of each class that implements it.
 *<br> This ordering is referred to as the class's natural ordering, and the class's compareTo
 * method is referred to as its natural comparison method.
 *
 * <p>Lists (and arrays) of objects that implement this interface can be sorted automatically
 * by Collections.sort (and Arrays.sort). Objects that implement this interface can be used
 * as keys in a sorted map or elements in a sorted set, without the need to specify a comparator.
 *
 * <p>The natural ordering for a class C is said to be consistent with equals if and only if
 * e1.compareTo(e2) == 0 has the same boolean value as e1.equals(e2) for every e1 and e2 of class C.
 * Note that null values are considered to be less than non-null values.
 *
 * <p>Since Java 8, Comparable is a functional interface and can therefore be used as the assignment
 * target for a lambda expression or method reference.
 */


public class EmployeeComparable implements Comparable<EmployeeComparable> {

    private int empId;
    private String name;
    private int age;

    @Override
    public int compareTo(EmployeeComparable o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public EmployeeComparable(int empId, String name, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        List<EmployeeComparable> employee1s = new ArrayList<>();
        employee1s.add(new EmployeeComparable(1, "Alex", 23));
        employee1s.add(new EmployeeComparable(2, "Carl", 43));
        employee1s.add(new EmployeeComparable(3, "Mark", 29));
        employee1s.add(new EmployeeComparable(4, "Sam", 32));
        employee1s.add(new EmployeeComparable(5, "Max", 37));
        for (EmployeeComparable emp : employee1s) {
            System.out.println(emp);
        }
        System.out.println("After sorting");
        Collections.sort(employee1s);
        for (EmployeeComparable emp : employee1s) {
            System.out.println(emp);
        }
    }
}
