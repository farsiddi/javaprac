package Trash;

import java.util.Random;

public class RandomLibrary {
    public static void main(String[] args) {
        String[] strt1 = {"Farhan","Rohan","Sanchay","Karan","Adams"};
        Random random = new Random();
        int random_index = random.nextInt(strt1.length);
        System.out.println(strt1[random_index]);
    }
}
