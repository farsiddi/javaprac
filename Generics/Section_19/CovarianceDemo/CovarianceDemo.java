package Generics.Section_19.CovarianceDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//Covariance allows subtypes (child classes) to be assigned to supertype references while ensuring read safety.


public class CovarianceDemo {
    public static void main(String[] args) {
        Employee[] employees = {new Employee(), new Employee()};
        printEmployee(employees);
        /**
         * If Developer and Manager are the subclass of the Employee class
         * then you have the flexibility to pass   Developer[] or  Manager[] to the method Employee[]
         * because both of them are subtype of Employee[]
         * When arrays vary in the same type as the elements then this concept is called Covariance
         */

        Developer[] developers = {new Developer(), new Developer()};
        printEmployee(developers);
        Manager[] managers = {new Manager(), new Manager()};
        printEmployee(managers);


        String name = "Hello";
        Object obj = name; // Since string is a sub type of object this will work

        List<String> stringList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
//        objectList = stringList; // this will not work because covariance concepts doesnt work in Collections

        Number[] numArr = {1, 32, 64, 8};
        Object[] objectsLObjects = numArr; // Covariance accepted
//        objectsLObjects[0] = "Alex"; // this dumb because objectsLObjects is = numArr but storing string doesnt give any compile time error but gives the runtimne exception (ArrayStoreException)


        List<Employee> employeeList1 = List.of(new Employee(), new Employee());
        printEmployee1(employeeList1);
        List<Developer> developers1 = List.of(new Developer(), new Developer());
//        printEmployee1(developers1); //See this will compile time error because covariance is not supported in Collections

    }


    public static void printEmployee(Employee[] empArray) {
        for (Employee employee : empArray) {
            System.out.println(employee);
        }
    }

    public static void printEmployee1(List<Employee> empArray) {
//        empArray.add(new Employee());
        for (Employee employee : empArray) {
            System.out.println(employee);
        }
    }
}
