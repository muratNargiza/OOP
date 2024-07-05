package lab3;

public class Circle extends MyShape{
	int xCoordinate;
	int yCoordinate;
	int radius;
	
	//Constructors---------------------------------------------------------------------------------
	public Circle() {
		super();
		this.xCoordinate = 0;
		this.yCoordinate = 0;
		this.radius = 1;
	}
	public Circle(int xCoordinate, int yCoordinate, int radius) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.radius = radius;
	}
	public Circle(String color, boolean filled, int xCoordinate, int yCoordinate, int radius) {
		super(color, filled);
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.radius = radius;
	}
	//------------------------------------------------------------------------------------------------
	
	//Getters--------------------
	public int getXCoordinate() {
		return xCoordinate;
	}
	public int getYCoordinate() {
		return yCoordinate;
	}
	public int getRadius() {
		return radius;
	}
	//---------------------------

	//Setters------------------------------------
	public void setXCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public void setYCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//-------------------------------------------
	
	//Methods--------------------------
	public double getArea() {
		return Math.PI * radius*radius;
	}
	
	public double getCircumference() {
		return Math.PI * 2 * radius;
	}
	
	public String toString() {
		return "Circle{" + 
		"xCoordinate= " + xCoordinate + 
		", yCoordinate= " + yCoordinate + 
		", radius= " + radius + 
		"} which is subclass of " + super.toString();
	}
	
	
}
