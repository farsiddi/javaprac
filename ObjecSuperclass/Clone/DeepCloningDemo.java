package ObjecSuperclass.Clone;

/**
 * Deep cloning creates a new object along with copies of the objects referenced by the original object.
 * It ensures that nested objects are cloned recursively.
 *
 * <p>To achieve deep cloning:</p>
 * <ul>
 *   <li>All nested objects must implement the {@code Cloneable} interface.</li>
 *   <li>The {@code clone()} method must be overridden to ensure deep copies of nested objects.</li>
 * </ul>
 *
 * <p>Unlike shallow cloning, changes to nested objects in the cloned instance do not affect the original object.</p>
 */

public class DeepCloningDemo {
    /**
     * Need to change the default {@code clone()} method in the Outer Class ({@code Students})
     * and implement the {@code Cloneable} interface in the Nested Object ({@code Courses}).
     *
     * <p><b>Important:</b> The nested objects must also override {@code clone()}
     * to ensure deep cloning.</p>
     */

    public static void main(String[] args) throws CloneNotSupportedException {

        Courses courses1 = new Courses("Physics");
        Students student1 = new Students("Alex", courses1);
        Students student2 = (Students) student1.clone();
        System.out.println(student2 == student1);
        System.out.println(student1.getCourses() == student2.getCourses());


    }
}

class Students implements Cloneable {
    private String name;
    private Courses courses; // Embedded object(in this case shallow cloning or deep cloning comes into picture)

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Students cloneStudent = (Students) super.clone();
        cloneStudent.courses = (Courses) courses.clone(); // Deep cloning the embedded or nested objects
        return cloneStudent;
    }

    public Students(String name, Courses courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }
}

class Courses implements Cloneable {
    private String courseName;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
