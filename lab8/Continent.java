package lab8;

public class Continent {
	private String name;
	private Country countries[] = new Country[1000];
	private int countryCount = 0;
	
	//Constructors---------------------------
	public Continent() {}
	public Continent(String name) {
		this.name = name;
	}
	//---------------------------------------
	
	//Getters and setters--------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//---------------------------------------
	
	//Methods-------------------------------
	public double getTotalIncomeOfAllResorts() {
		double totalIncome = 0;
		for(int i = 0; i < countryCount; i++) {
			totalIncome += countries[i].getTotalIncome();
		}
		return totalIncome;
	}
	public void addCountry(Country country) {
		this.countries[countryCount] = country;
		this.countryCount++;
	}
	public Country getTheMostProfitableCountry() {
		double maxTotalIncome = countries[0].getTotalIncome();
		Country mostProfitableCountry = countries[0];
		for(int i = 0; i < countryCount; i++) {
			if(maxTotalIncome < countries[i].getTotalIncome()) {
				maxTotalIncome = countries[i].getTotalIncome();
				mostProfitableCountry = countries[i];
			}	
		}
		return mostProfitableCountry;
	}
	public int getCountryCount()
	{
		return countryCount;
	}
	public String toString() {
		return "Continent name: " + name;
	}
	
}
