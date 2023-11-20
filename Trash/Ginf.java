package Trash;

public  class  Ginf {
    int num;
//    public int a;
//    String name;
//    int[] arr;
//
//    public Trash.Ginf(int a, String name, int[] arr) {
//        this.a = a;
//        this.name = name;
//        this.arr = arr;
//    }

    public Ginf(int num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return "Trash.Ginf{" +
                "num=" + num +
                '}';
    }
    public static void main(String[] args) {
        Ginf nn = new Ginf(63);
        System.out.println(nn);
    }
}