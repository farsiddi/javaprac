package Comparing;

public class Employee {
    String name;
    int age;
    int salary;
    int workexp;

    public Employee(String name, int age, int salary, int workexp) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workexp = workexp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", workexp=" + workexp +
                '}';
    }
}