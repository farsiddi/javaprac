package Generics.Section_19;

import Generics.Section_19.CovarianceDemo.Developer;
import Generics.Section_19.CovarianceDemo.Employee;

import java.util.ArrayList;
import java.util.List;

//  can accpet employee or its subtype
//earlier we were not able to use this because generics not supported in collection
public class UpperBoundSubtypeWildcard {
    public static void main(String[] args) {
        List<Employee> employeeList1 = List.of(new Employee(), new Employee());
        printEmployeeNames(employeeList1);
        List<Developer> developers1 = List.of(new Developer(), new Developer());
        printEmployeeNames(developers1);
//        The above line is working now(not working in CovarianceDemo.java) because now covariance is possible because of           upper bound or subtype wildcard

    }

    public static void printEmployeeNames(List<? extends Employee> employees) {
//        employees.add(new Employee()); // disadvantage - cannot add a new element
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
