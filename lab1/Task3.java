package lab1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();

        double t1 = scanner.nextDouble();

        double t2 = scanner.nextDouble();

        double distanceBeforeNoon = 20.0;
        double distanceAfterNoon = A - distanceBeforeNoon;

        double velocityBeforeNoon = distanceBeforeNoon / t1;
        double velocityAfterNoon = distanceAfterNoon / t2;

        if (velocityBeforeNoon > velocityAfterNoon) {
            System.out.println("Before");
        } else if (velocityBeforeNoon < velocityAfterNoon) {
            System.out.println("After");
        } else {
            System.out.println("Equal");
        }

        scanner.close();
    }
}

