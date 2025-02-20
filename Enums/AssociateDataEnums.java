package Enums;

import java.util.Arrays;

public class AssociateDataEnums {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Employee.values()));
        Employee[] arr = Employee.values();
        for (Employee emp : arr) {
            System.out.println("Name- " + emp + " age " + emp.getAge());
        }

    }

    public enum Employee {
        ENGINEER(23), HR(27), MANAGER(32), SALESMAN(22);

        private final int age;

        private Employee(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

    }
}
