package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(5,7,9);
//        System.out.println(box.l+" "+box.h+" "+ box.w);

//        BoxWeight boxx1 = new BoxWeight();
//        BoxWeight boxx = new BoxWeight(2,4,7,9);
//        System.out.println(boxx.h);
//        System.out.println(boxx.l);
//        System.out.println(boxx.w);
//        System.out.println(boxx.weight);

//        BoxPrice boxp = new BoxPrice(3,5,2,4,4);
//        System.out.println(boxp.l);
//        System.out.println(boxp.h);
//        System.out.println(boxp.w);
//        System.out.println(boxp.weight);
//        System.out.println(boxp.cost);

        BoxPrice boxxp = new BoxPrice(2,5,7);
        System.out.println(boxxp.l);
        System.out.println(boxxp.h);
        System.out.println(boxxp.w);
        System.out.println(boxxp.weight);
        System.out.println(boxxp.cost);
    }
}
