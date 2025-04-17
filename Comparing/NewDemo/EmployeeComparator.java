package Comparing.NewDemo;

//Check the difference below

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * A comparison function, which imposes a total ordering on some collection of objects.
 * Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort)
 * to allow precise control over the sort order. Comparators can also be used to control
 * the order of certain data structures (such as sorted sets or sorted maps), or to provide
 * an ordering for collections of objects that don't have a natural ordering.
 *
 * <p>The ordering imposed by a comparator c on a set of elements S is said to be consistent
 * with equals if and only if c.compare(e1, e2) == 0 has the same boolean value as e1.equals(e2)
 * for every e1 and e2 in S. Note that null values are considered to be less than non-null values.
 *
 * <p>Since Java 8, Comparator is a functional interface and can therefore be used as the assignment
 * target for a lambda expression or method reference.
 */

public class EmployeeComparator {
    private int empId;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "EmployeeComparator{" +
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

    public EmployeeComparator(int empId, String name, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<EmployeeComparator> employee1s = new ArrayList<>();
        employee1s.add(new EmployeeComparator(1, "Alex", 23));
        employee1s.add(new EmployeeComparator(7, "Carl", 43));
        employee1s.add(new EmployeeComparator(11, "Mark", 29));
        employee1s.add(new EmployeeComparator(2, "Sam", 32));
        employee1s.add(new EmployeeComparator(6, "Max", 37));
        System.out.println("Before comparison");
        for (EmployeeComparator emp : employee1s) {
            System.out.println(emp);
        }
        System.out.println("Age comparison");
        Collections.sort(employee1s, new ageComparator());
        for (EmployeeComparator emp : employee1s) {
            System.out.println(emp);
        }
        System.out.println("ID comparison");
        Collections.sort(employee1s, new idComparator());
        for (EmployeeComparator emp : employee1s) {
            System.out.println(emp);
        }
    }
}

/**
 * This class provides a comparison between the Comparable and Comparator interfaces in Java.
 *
 * <p>Both interfaces are used for sorting objects, but they serve different purposes and have different
 * implementations. Below is a detailed comparison:
 *
 * <table border="1">
 *   <caption>Comparison between Comparable and Comparator</caption>
 *   <tr>
 *     <th>Feature</th>
 *     <th>Comparable</th>
 *     <th>Comparator</th>
 *   </tr>
 *   <tr>
 *     <td>Purpose</td>
 *     <td>Natural ordering</td>
 *     <td>Custom ordering</td>
 *   </tr>
 *   <tr>
 *     <td>Interface Location</td>
 *     <td>java.lang</td>
 *     <td>java.util</td>
 *   </tr>
 *   <tr>
 *     <td>Method</td>
 *     <td>compareTo(T o)</td>
 *     <td>compare(T o1, T o2)</td>
 *   </tr>
 *   <tr>
 *     <td>Usage</td>
 *     <td>Implemented by the class</td>
 *     <td>Implemented as a separate class</td>
 *   </tr>
 *   <tr>
 *     <td>Sorting Sequences</td>
 *     <td>Single</td>
 *     <td>Multiple</td>
 *   </tr>
 *   <tr>
 *     <td>Consistency</td>
 *     <td>Consistent with equals</td>
 *     <td>Consistent with equals</td>
 *   </tr>
 *   <tr>
 *     <td>Example</td>
 *     <td>Collections.sort(List)</td>
 *     <td>Collections.sort(List, Comparator)</td>
 *   </tr>
 * </table>
 *
 * <p>Here are some key points to remember:
 * <ul>
 *   <li><b>Comparable</b> is used for natural ordering and is implemented by the class itself.</li>
 *   <li><b>Comparator</b> is used for custom ordering and can be implemented as a separate class, allowing multiple sorting sequences.</li>
 * </ul>
 */
class ageComparator implements Comparator<EmployeeComparator> {

    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.getAge() - o2.getAge();
    }
}

class idComparator implements Comparator<EmployeeComparator> {

    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.getEmpId() - o2.getEmpId();
    }
}
