package lab11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainTask5 {

    public static void main(String[] args) {
        ArrayList<Task5.Point> points = generateRandomPoints(100);

        // Sort points by x-coordinates using natural ordering (Comparable)
        System.out.println("Points sorted by x-coordinates:");
        Collections.sort(points);
        printPoints(points);

        System.out.println();

        // Sort points by y-coordinates using CompareY comparator
        System.out.println("Points sorted by y-coordinates:");
        Task5.CompareY compareY = new Task5.CompareY();
        Collections.sort(points, compareY);
        printPoints(points);
    }

    // Method to generate random points
    private static ArrayList<Task5.Point> generateRandomPoints(int count) {
        ArrayList<Task5.Point> points = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int x = random.nextInt(100); // Random x-coordinate between 0 and 99
            int y = random.nextInt(100); // Random y-coordinate between 0 and 99
            points.add(new Task5.Point(x, y));
        }

        return points;
    }

    // Method to print list of points
    private static void printPoints(ArrayList<Task5.Point> points) {
        for (Task5.Point point : points) {
            System.out.println(point);
        }
    }
}
