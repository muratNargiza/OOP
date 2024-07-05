package lab7;

public class Worker {
	private String fullName;
	private double energy;// kilojoules
	private double power; //kilowatts
	private double efficiency;//from 0.1 to 0.4
	
	//Constructors-----------------------------------------------
	public Worker() {}
	public Worker(String fullName, 
			double energy, double power, double efficiency) {
		this.fullName = fullName;
		this.energy = energy;
		this.power = power;
		this.efficiency = efficiency;
	}
	//------------------------------------------------------------
	
	//Getters and setters------------------------------------------
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getEnergy() {
		return energy;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public double getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	//-------------------------------------------------------------
	
	//Methods-----------------------------------------------------
	public String toString() {
		return "Full Name: " + fullName + 
				"\nEnergy: " + energy +
				"\nPower: " + power +
				"\nEfficiency: " + efficiency;
	}
	
	public double toWork(int time/*by hours*/) {
		double work = power * 3600 * efficiency;
		double totalWork = 0;
		double e = energy;
		while(e > 0 && time != 0) {
			if(work > e) {
				work = e;
			}
			e = e - work;
			time--;
			totalWork += work;
		}
		return totalWork;
	}
}
