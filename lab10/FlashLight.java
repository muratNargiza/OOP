package lab10;

public class FlashLight {

    private Battery[] batteries;

    public FlashLight() {
    }

    public FlashLight(Battery[] batteries) {
        this.batteries = batteries;
    }

    public Battery[] getBatteries() {
        return batteries;
    }

    public void setBatteries(Battery[] batteries) {
        this.batteries = batteries;
    }

    public double getTotalPower() {
        double totalPower = 0.0;
        for (Battery battery : batteries) {
            totalPower += battery.getPower();
        }
        return totalPower;
    }

    public double getTotalEnergy() {
        double totalEnergy = 0.0;
        for (Battery battery : batteries) {
            totalEnergy += battery.getLifeTime();
        }
        return totalEnergy;
    }

    public double getTotalLifeTime() {
        double totalEnergy = getTotalEnergy();
        double totalPower = getTotalPower();
        if (totalPower == 0.0) {
            return 0.0;
        }
        double totalLifeTime = totalEnergy / totalPower;
        return totalLifeTime;
    }
}

