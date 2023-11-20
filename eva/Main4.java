package eva;

import java.util.*;

public class Main4 {


    public static void main(String[] args) {
        Set<Student> studDetails = new TreeSet<>();
        ArrayList<Student> hvcd = new ArrayList<>();
        studDetails.add(new Student(23,"Kunal","CSE"));
        studDetails.add(new Student(52,"Karan","MECH"));
        studDetails.add(new Student(32,"Rohan","CIVIL"));
        studDetails.add(new Student(23,"Kunal","CSE"));

        

        System.out.println(studDetails);
        Collections.sort(hvcd);

    }
}
