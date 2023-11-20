package Inheritance;

public class BoxWeight extends Box{
    double weight;
    //    BoxWeight boxx = new BoxWeight();

    public  BoxWeight(){
        this.weight =-1;
    }
//    public BoxWeight(double l, double w, double h,double weight){
//        super(l, w, h);
//        this.weight = weight;
//    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); //call the parent class constructor
//       use to initialise values present in parent class
        this.weight = weight;
    }
    public BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
