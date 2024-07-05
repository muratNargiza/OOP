package lab1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sumOfOdd = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number % 2 != 0) {
                sumOfOdd += number;
            }
        }

        System.out.println(sumOfOdd);

        scanner.close();
    }
}

