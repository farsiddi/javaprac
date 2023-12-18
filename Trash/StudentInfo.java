package Trash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Farhan", 101));
        studentList.add(new Student("Sanchay", 212));
        studentList.add(new Student("Shivam", 143));
        studentList.add(new Student("Abhishek", 584));
        studentList.add(new Student("Alok", 233));

        Collections.sort(studentList, Comparator.comparing(Student::getName));

        System.out.println("Students sorted by name in ascending order:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }
    }
}
