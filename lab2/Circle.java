package lab2;

public class Circle {
    int xCoordinate;
    int yCoordinate;
    int radius;

    public Circle(int xCoordinate, int yCoordinate, int radius) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Double getArea() {
        return Math.PI * radius * radius;
    }

    public Double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public Double getDistanceTo(Circle anotherCircle) {
        double dx = this.xCoordinate - anotherCircle.xCoordinate;
        double dy = this.yCoordinate - anotherCircle.yCoordinate;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", radius=" + radius +
                '}';
    }
}
