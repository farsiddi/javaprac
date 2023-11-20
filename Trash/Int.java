package Trash;

public class Int {
    public static void main(String[] args) {
        Int vc = new Int();
        vc.setRno(23);
        System.out.println(vc.getRno());
        int[] gh = new int[5];
        gh[0] =1;
        gh[1] =2;
        gh[2] =3;
        gh[3] =4;
        System.out.println(gh[4]);


    }

    private int rno;
//    public int getRno(){
//        return rno;
//    }
//    public void setRno(int rno){
//        this.rno = rno;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }
//    }
}
