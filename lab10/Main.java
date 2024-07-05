package lab10;

public class Main {
    public static void main(String[] args) {
        // Create 5 ToshibaBattery objects
        ToshibaBattery[] toshibaBatteries = {
                new ToshibaBattery(12.0, 2.5, 100000.0, 5000.0),
                new ToshibaBattery(12.0, 2.0, 120000.0, 6000.0),
                new ToshibaBattery(11.0, 3.0, 150000.0, 4000.0),
                new ToshibaBattery(10.0, 2.0, 110000.0, 3000.0),
                new ToshibaBattery(11.5, 2.5, 130000.0, 4500.0)
        };

        // Create 5 DuracellBattery objects
        DuracellBattery[] duracellBatteries = {
                new DuracellBattery(12.0, 2.5, 100000.0, 1.0),
                new DuracellBattery(11.0, 2.0, 120000.0, 0.8),
                new DuracellBattery(10.5, 3.0, 150000.0, 1.2),
                new DuracellBattery(11.5, 2.0, 110000.0, 1.1),
                new DuracellBattery(12.5, 2.5, 130000.0, 1.5)
        };

        // Create 5 FlashLight objects
        FlashLight[] flashLights = {
                new FlashLight(new Battery[] {toshibaBatteries[0], duracellBatteries[0]}),
                new FlashLight(new Battery[] {toshibaBatteries[1], duracellBatteries[1]}),
                new FlashLight(new Battery[] {toshibaBatteries[2], duracellBatteries[2]}),
                new FlashLight(new Battery[] {toshibaBatteries[3], duracellBatteries[3]}),
                new FlashLight(new Battery[] {toshibaBatteries[4], duracellBatteries[4]})
        };

        // Print lifetimes of all flashlights
        for (int i = 0; i < flashLights.length; i++) {
            double lifetime = flashLights[i].getTotalLifeTime();
            System.out.println("FlashLight " + (i + 1) + " Lifetime: " + lifetime + " seconds");
        }

        // Find flashlight with maximum lifetime
        double maxLifetime = 0.0;
        int maxIndex = -1;
        for (int i = 0; i < flashLights.length; i++) {
            double lifetime = flashLights[i].getTotalLifeTime();
            if (lifetime > maxLifetime) {
                maxLifetime = lifetime;
                maxIndex = i;
            }
        }

        // Print data of flashlight with maximum lifetime value
        if (maxIndex != -1) {
            System.out.println("\nFlashLight with Maximum Lifetime:");
            System.out.println("Lifetime: " + maxLifetime + " seconds");
            Battery[] batteries = flashLights[maxIndex].getBatteries();
            for (int i = 0; i < batteries.length; i++) {
                System.out.println("Battery " + (i + 1) + ": " + batteries[i].getClass().getSimpleName());
                System.out.println("\tPower: " + batteries[i].getPower() + " watts");
                System.out.println("\tLifeTime: " + batteries[i].getLifeTime() + " seconds");
            }
        } else {
            System.out.println("\nNo flashlights found.");
        }
    }
}

