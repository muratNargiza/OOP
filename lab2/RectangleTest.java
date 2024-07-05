package lab2;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x1 coordinate of the top-left corner: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y1 coordinate of the top-left corner: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter the x2 coordinate of the bottom-right corner: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y2 coordinate of the bottom-right corner: ");
        double y2 = scanner.nextDouble();

        Rectangle myRectangle = new Rectangle(x1, y1, x2, y2);

        System.out.println("myRectangle: " + myRectangle);

        System.out.println("Area of myRectangle: " + myRectangle.getArea());

        System.out.println("Perimeter of myRectangle: " + myRectangle.getPerimeter());

        System.out.print("Enter the x1 coordinate of the top-left corner for the second rectangle: ");
        double x1_2 = scanner.nextDouble();
        System.out.print("Enter the y1 coordinate of the top-left corner for the second rectangle: ");
        double y1_2 = scanner.nextDouble();
        System.out.print("Enter the x2 coordinate of the bottom-right corner for the second rectangle: ");
        double x2_2 = scanner.nextDouble();
        System.out.print("Enter the y2 coordinate of the bottom-right corner for the second rectangle: ");
        double y2_2 = scanner.nextDouble();

        Rectangle secondRectangle = new Rectangle(x1_2, y1_2, x2_2, y2_2);

        System.out.println("Distance from myRectangle to secondRectangle: " + myRectangle.getDistanceToTheCenterOf(secondRectangle));

        scanner.close();
    }
}
