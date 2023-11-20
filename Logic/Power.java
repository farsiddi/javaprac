package Logic;

public class Power {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int num =2;
        int pow =-2;
        System.out.println(powe(num,pow));

    }
    public static  double powe(int num,int exp){
        double temp=1;
        exp = -1*exp;
        for(int i=1 ;i<=exp;i++){
//            temp =num*num;
//            num =temp;
            temp = temp*num;
//            temp+=temp;

        }
        double fin = 1/ temp;
        return fin;
    }
//    n ^ -p = 1 / ( n ^ p)
}
//        Stream APi
//        Spring vs Spring boot
//