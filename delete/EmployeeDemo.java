package delete;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Alex", "Adam", 31));
        emp.add(new Employee("Carl", "Sam", 25));
        emp.add(new Employee("Mike", "Johnson", 45));
        emp.add(new Employee("John", "Clarke", 19));
        emp.add(new Employee("Carl", "Sam", 25));

        for (Employee ob : emp) {
            System.out.println(ob);
        }
        Collections.sort(emp, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("Sorted List");

        for (Employee ob : emp) {
            System.out.println(ob);
        }
//        List<Employee> distinctList = emp.stream().distinct().toList();
        Set<Employee> distinctList = new HashSet<>(emp);
        System.out.println(distinctList);

    }
}
