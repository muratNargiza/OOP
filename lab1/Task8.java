package lab1;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double sum = 0.0;
        int sign = 1;

        for (int i = 1; i <= n; i++) {
            double term = 1.0 / (2 * i - 1);

            sum += sign * term;

            sign = -sign;
        }

        System.out.println(sum);

        scanner.close();
    }
}


