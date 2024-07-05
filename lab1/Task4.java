package lab1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        double y = scanner.nextDouble();

        double functionY = 5 * x * x - 7 * x + 2;

        if (functionY == y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}

