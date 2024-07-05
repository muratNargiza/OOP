package lab2;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int radius1 = scanner.nextInt();

        Circle myCircle = new Circle(x1, y1, radius1);

        System.out.println(myCircle);

        System.out.println("Площадь " + myCircle.getArea());

        System.out.println("Длина окружности " + myCircle.getCircumference());

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int radius2 = scanner.nextInt();

        Circle secondCircle = new Circle(x2, y2, radius2);

        System.out.println(myCircle.getDistanceTo(secondCircle));

        scanner.close();
    }
}

