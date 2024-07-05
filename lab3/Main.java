package lab3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int xTopLeftCoordinate = input.nextInt(); 
		int yTopLeftCoordinate = input.nextInt(); 
		int sideLength = input.nextInt();
		
		Square square = new Square(xTopLeftCoordinate, yTopLeftCoordinate, sideLength);
		System.out.println("Площадь: " + square.getArea());
		System.out.println("Периметр: " + square.getCircumference());
		System.out.println("Цвет: " + square.getColor());
		System.out.println("Закрашен: " + square.IsFilled());
		
		String newColor = input.next();
		
		square.setColor(newColor);
		
		
		System.out.println("Цвет: " + square.getColor());

	}

}
