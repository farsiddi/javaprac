package Comparing;

public class Result implements Comparable<Result>{
    @Override
    public int compareTo(Result o) {
        return -(this.marks - o.marks);
    }
    String name;
    int rno;
    int marks;

//    @Override
//    public String toString() {
//        return "Result{" +
//                "name='" + name + '\'' +
//                ", rno=" + rno +
//                ", marks=" + marks +
//                '}';
//    }

    public Result(String name, int rno, int marks) {
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }

}
