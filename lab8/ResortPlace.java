package lab8;

import java.util.Arrays;

public class ResortPlace {
	private String name;
	private String city;
	private Tourist tourist[] = new Tourist[1000];
	private int touristCount = 0;
	//Constructors--------------------------------
	public ResortPlace() {}
	public ResortPlace(String name, String city) {
		this.name = name;
		this.city = city;
	}
	//--------------------------------------------
	
	//Getters and setters-------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//---------------------------------------------
	
	//Methods--------------------------------------
	public void addTourist(Tourist tourist) {
		this.tourist[touristCount] = tourist;
		this.touristCount++;
	}
	public double getTotalIncome() {
		double totalIncome = 0;
		for(int i = 0; i < touristCount; i++) {
			totalIncome += tourist[i].getIncomeMoney();
		}
		return totalIncome;
	}
	public int getTotalTourists() {
		return touristCount;
	}
	public String toString() {
		String result = "Resort Place: " + name + 
						", City: " + city + 
						"\n----------" + 
						"\nTourists:\n";
		for (int i = 0; i < touristCount; i++) {
	        result += tourist[i].getName() + "\n";
	    }
		result += "\n----------" + 
				"\nTotal Income: " + getTotalIncome();
		return result;
	}
}
