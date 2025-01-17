public class PassingDataInPrimitiveNonPrimitive {


    public static int changeId(int id) {
        return id = 9999;
    }

    public static void main(String[] args) {
        int id = 1111;
        System.out.println(id);
        System.out.println(changeId(id));
//        This Value remains same because its is primitive and
//        it doesnt affect the state of the variable where the methods is invoked.
        System.out.println(id);

        Student s1 = new Student();
        s1.studentId = 77777;
        System.out.println(changeID(s1));
//        This value changes because it is non-primitve/object refrence type and
//        it does affect the state of the variable where the methods is invoked.
        System.out.println(s1.studentId);

    }

    public static int changeID(Student st) {
        return st.studentId = 5555;
    }

    public static class Student {
        public int studentId;


    }
}
