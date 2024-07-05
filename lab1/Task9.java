package lab1;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = Math.abs(number);

        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            sum += digit;
            originalNumber /= 10;
        }

        System.out.println(sum);

        scanner.close();
    }
}

