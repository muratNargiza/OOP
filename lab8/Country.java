package lab8;

public class Country {
	private String name;
	private ResortPlace resortPlaces[] = new ResortPlace[1000];
	private int resortCount = 0;
	
	//Constructors---------------------------------------------
	public Country() {}
	public Country(String name) {
		this.name = name;
	}
	//----------------------------------------------------------
	
	//Getters and setters------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//-------------------------------------------
	
	//Methods-------------------------------------
	public void addResort(ResortPlace resort) {
		this.resortPlaces[resortCount] = resort;
		this.resortCount++;
	}
	public void printAllResorts() {
	    for (int i = 0; i < resortCount; i++) {
	        System.out.println(resortPlaces[i].toString());
	    }
	}
	public double getTotalIncome() {
		double totalIncome = 0;
		for(int i = 0; i < resortCount; i++) {
			totalIncome += resortPlaces[i].getTotalIncome();
		}
		return totalIncome;
	}
	
	public String toString() {
		return "Country name: " + name;
	}
	
}
