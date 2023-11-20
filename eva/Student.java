package eva;

import java.util.Objects;

public class Student implements Comparable<Student>{
    public int id;
    public String name;
   public String dept;

    public Student(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(dept, student.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dept);
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}
