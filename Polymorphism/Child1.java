package Polymorphism;

import Polymorphism.Career;

public class Child1 extends Career {
    private int weight;


    public Child1(){
        System.out.println("I want to be Doctor");

    }

    public Child1(int marks,String name , int weight){
        super(marks,name);
        this.weight = weight;
    }

}
