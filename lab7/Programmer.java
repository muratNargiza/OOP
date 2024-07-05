package lab7;

public class Programmer extends Worker {
	private double moralMotivation; //from 0.5 to 2
	//Constructors-------------------------------------------------
	public Programmer() {}
	public Programmer(String fullName, 
			double energy, double power, double efficiency) {
		super(fullName, energy, power, efficiency);
	}
	public Programmer(String fullName, double energy, double power, 
			double efficiency, double moralMotivation ) {
		super(fullName, energy, power, efficiency);
		this.moralMotivation = moralMotivation;
	}
	//-------------------------------------------------------------
	
	//Getters and setters------------------------------------------
	public double getMoralMotivation() {
		return moralMotivation;
	}
	public void setMoralMotivation(double moralMotivation) {
		this.moralMotivation = moralMotivation;
	}
	//-------------------------------------------------------------
	
	//Methods------------------------------------------------------
	public String toString() {
		return super.toString() + 
				"\nMoral Motivation: " + moralMotivation;
	}
	public double toWork(int time) {
		double work = super.getPower() * 
				3600 * super.getEfficiency() * moralMotivation;
		double totalWork = 0;
		double e = super.getEnergy();
		while(e > 0 && time != 0) {
			if(work > e) {
				work = e;
			}
			e = e - work;
			time--;
			totalWork+= work;
		}
		return totalWork;
	}
	
	
}
