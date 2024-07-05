package lab8;

public class Tourist {
	private String name;
	private double incomeMoney;
	//Constructors------------------------------------
	public Tourist() {}
	public Tourist(String name, double incomeMoney) {
		this.name = name;
		this.incomeMoney = incomeMoney;
	}
	//-----------------------------------------------
	
	//Getters and setters----------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIncomeMoney() {
		return incomeMoney;
	}
	public void setIncomeMoney(double incomeMoney) {
		this.incomeMoney = incomeMoney;
	}
	//-----------------------------------------------
	
	//Methods----------------------------------------
	public String toString() {
		return "Name: " + name +
				"\nIncome money: " + incomeMoney;
	}
	
	
}
