package lab1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if ( input.length() != 6 ) {
            System.out.println("Invalid input. Please enter a six-digit number.");
            return;
        }

        int digit1 = Character.getNumericValue(input.charAt(0));
        int digit2 = Character.getNumericValue(input.charAt(1));
        int digit3 = Character.getNumericValue(input.charAt(2));
        int digit4 = Character.getNumericValue(input.charAt(3));
        int digit5 = Character.getNumericValue(input.charAt(4));
        int digit6 = Character.getNumericValue(input.charAt(5));

        int sumFirstThree = digit1 + digit2 + digit3;
        int sumLastThree = digit4 + digit5 + digit6;

        if (sumFirstThree == sumLastThree) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}

