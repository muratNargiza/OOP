package lab1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double num1 = scanner.nextDouble();

        double num2 = scanner.nextDouble();


        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println("Two numbers are equal");
        }

        scanner.close();



    }
}