package ObjecSuperclass.Clone;

/**
 * Shallow cloning creates a new object but does not copy the objects referenced
 * by the original object. Instead, it copies references to those objects.
 */
public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course1 = new Course("Physics");
        Student student1 = new Student("Alex", course1);
        Student student2 = (Student) student1.clone();
        System.out.println(student2 == student1); // False
//        Gives false because a new object is created with different memory location
        System.out.println(student2.getCourse() == student1.getCourse()); // True
//        True - although a new object is created student2, but the embedded object(Course) (example-student class have object of another class that is Course) ,student2 is pointing to the same course, no new memory location of the object course, only the reference is copied in the shallow cloning
//        student1 → References a math course (embedded object)
//       student2 (clonedStudent) → Also references the same math course (embedded object)

    }

}

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
}

class Student implements Cloneable {
    private String name;
    private Course course;  // Embedded object(in this case shallow cloning or deep cloning comes into picture)

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
