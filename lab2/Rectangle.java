package lab2;

import java.util.Scanner;

public class Rectangle {
    private double x1, y1;
    private double x2, y2;

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getArea() {
        return Math.abs((x2 - x1) * (y2 - y1));
    }

    public double getPerimeter() {
        return 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }

    public double getDistanceToTheCenterOf(Rectangle anotherRectangle) {
        double thisCenterX = (x1 + x2) / 2;
        double thisCenterY = (y1 + y2) / 2;
        double anotherCenterX = (anotherRectangle.x1 + anotherRectangle.x2) / 2;
        double anotherCenterY = (anotherRectangle.y1 + anotherRectangle.y2) / 2;

        double dx = thisCenterX - anotherCenterX;
        double dy = thisCenterY - anotherCenterY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}

