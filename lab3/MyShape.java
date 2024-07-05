package lab3;

public class MyShape {
	String color;
	boolean filled;
	
	//Constructors--------------------------------
	public MyShape() {
		this.color = "red";
		this.filled = true;
	}
	public MyShape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	//--------------------------------------------
	
	//Getters-----------------
	public String getColor() {
		return color;
	}
	public boolean IsFilled() {
		return filled;
	}
	//-------------------------
	
	//Setters----------------------------
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	//-------------------------------------
	
	//Methods----------------------------------
	public double getArea() {
		return 0;
	}
	
	public double getCircumference() {
		return 0;
	}
	
	public String toString() {
		return "MyShape{" + 
				"color=" + color + 
				", isFilled=" + filled +
				'}';
	}
	
}
