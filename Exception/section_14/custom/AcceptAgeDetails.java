package Exception.section_14.custom;

import java.util.Scanner;

public class AcceptAgeDetails {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        System.out.println(age);
        if (age < 0 || age > 100) {

            throw new InvalidAgeException("Invalid age.Provide age between 0 and 100");
        } else {
            System.out.println("Age - " + age);
        }
    }
}
