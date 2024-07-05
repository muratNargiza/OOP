package lab7;

public class Teacher extends Worker {
	private double tiredness; // from 0.01 to 0.1
	//Constructors---------------------------------------------
	public Teacher() {}
	public Teacher(String fullName, double energy, 
			double power, double efficiency) {
		super(fullName, energy, power, efficiency);
	}
	public Teacher(String fullName, double energy, 
			double power, double efficiency, double tiredness) {
		super(fullName, energy, power, efficiency);
		this.tiredness = tiredness;
	}
	//----------------------------------------------------------
	
	//Getters and setters---------------------------------------
	public double getTiredness() {
		return tiredness;
	}
	public void setTiredness(double tiredness) {
		this.tiredness = tiredness;
	}
	//----------------------------------------------------------
	
	//Methods---------------------------------------------------
	public String toString() {
		return super.toString() + 
				"\nTiredness: " + tiredness;
	}
	
	public double toWork(int time) {
		double e = super.getEnergy();
		double totalWork = 0;
		int i = 1;
		while(e > 0 && time != 0) {
			double work = super.getPower() * 3600 * 
					(super.getEfficiency() - i * tiredness);
			if(work > e) {
				work = e;
			}
			e = e - work;
			time--;
			totalWork += work;
			i++;
		}
		return totalWork;
	}
}
