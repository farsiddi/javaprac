package Comparing;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparator {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Farhan",23,25000,3));
        emp.add(new Employee("Rohan",22,32000,5));
        emp.add(new Employee("Ali",20,44000,2));
        emp.add(new Employee("Tahir",25,47000,4));
        Collections.sort(emp,new AgeComparator());
//        Collections.sort(emp,new WorkexpComparator());
//        Collections.sort(emp,new SalaryComparator());
        for(Employee em : emp){
            System.out.println(em.name+" "+em.age+" "+em.salary+" "+em.workexp);
        }
/*
        for (Employee em : emp){
            if (em.age==25){
                System.out.println(em.name+" "+em.age+" "+em.salary+" "+em.workexp);
            }
        }
*/


    }

}
