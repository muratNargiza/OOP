package lab1;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();

        double m = scanner.nextDouble();


        for (double x = n; x <= m; x += 0.5) {
            double y = -2.4 * x * x + 5 * x - 3;
            System.out.println(x + " " + y);
        }

        scanner.close();
    }
}

