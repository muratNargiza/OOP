package lab8;

public class Main {

	public static void main(String[] args) {
		Country c = new Country("Kazakhstan");
		Tourist t1 = new Tourist("Alex", 450000);
		Tourist t2 = new Tourist("Robert", 420000);
		Tourist t3 = new Tourist("Max", 430000);
		Tourist t4 = new Tourist("Anna", 510000);
		Tourist t5 = new Tourist("Simon", 390000);
		ResortPlace r1 = new ResortPlace("ShymkentPlaza", "Shymkent");
		ResortPlace r2 = new ResortPlace("Rixos", "Aktau");
		ResortPlace r3 = new ResortPlace("Kazakhstan", "Almaty");
		ResortPlace r4 = new ResortPlace("Caspian", "Aktau");
		ResortPlace r5 = new ResortPlace("Astana Saad", "Astana");
		r1.addTourist(t1);
		r1.addTourist(t2);
		r1.addTourist(t3);
		r1.addTourist(t4);
		r1.addTourist(t5);
		
		c.addResort(r1);
		c.addResort(r2);
		c.addResort(r3);
		c.addResort(r4);
		c.addResort(r5);
		c.printAllResorts();
		System.out.println("Total sum of incomes in our country: " + c.getTotalIncome());
		Tourist[] tourists = {t1, t2, t3, t4, t5};
		ResortPlace[] resorts = {r1, r2, r3, r4, r5};
		double totalAmountOfTourists = 0;
		for(int i = 0; i < resorts.length; i++) {
			totalAmountOfTourists += resorts[i].getTotalTourists();
		}
		System.out.println("Total sum of incomes in our country: " + totalAmountOfTourists);
		double maxIncome = resorts[0].getTotalIncome();
		ResortPlace popularResort = resorts[0];
		for(int i = 0; i < resorts.length; i++) {
			if(maxIncome < resorts[i].getTotalIncome()) {
				maxIncome = resorts[i].getTotalIncome();
				popularResort = resorts[i];
			}
		}
		System.out.println("Popular resort in our country: " + popularResort);
		
		maxIncome = tourists[0].getIncomeMoney();
		Tourist richestTourist = tourists[0];
		for(int i = 0; i < tourists.length; i++) {
			if(maxIncome < tourists[i].getIncomeMoney()) {
				maxIncome = tourists[i].getIncomeMoney();
				richestTourist = tourists[i];
			}
		}
		System.out.println("The richest tourist in the country: " + richestTourist);
	}

}
