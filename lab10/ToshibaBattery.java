package lab10;

// ToshibaBattery.java
public class ToshibaBattery extends Battery {

    private double voltage;
    private double current;
    private double energy;
    private double extraEnergy;

    public ToshibaBattery(double voltage, double current, double energy, double extraEnergy) {
        this.voltage = voltage;
        this.current = current;
        this.energy = energy;
        this.extraEnergy = extraEnergy;
    }


    @Override
    public double getPower() {
        double power = voltage * current;
        return power;
    }

    @Override
    public double getLifeTime() {
        double power = getPower();
        double totalEnergy = energy + extraEnergy;
        double lifeTime = totalEnergy / power;
        return lifeTime;
    }
}

