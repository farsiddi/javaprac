package AccessSpecifier;

public class Access {
     int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Access(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
 
    public static void main(String[] args) {
        Access check = new Access(23,"Farhan");
        System.out.println(check.num);
    }
}
