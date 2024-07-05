package lab10;

public class DuracellBattery extends Battery {

    private double voltage;
    private double current;
    private double energy;
    private double internalVoltage;

    public DuracellBattery(double voltage, double current, double energy, double internalVoltage) {
        this.voltage = voltage;
        this.current = current;
        this.energy = energy;
        this.internalVoltage = internalVoltage;
    }


    @Override
    public double getPower() {
        double power = voltage * current;
        return power;
    }

    @Override
    public double getLifeTime() {
        double effectiveVoltage = voltage + internalVoltage;
        double lifeTime = energy / (effectiveVoltage * current);
        return lifeTime;
    }
}

