package lab7;

public class Main {

	public static void main(String[] args) {
		Programmer p1 = new Programmer("Arman", 10000, 5, 0.3, 1.5);
        Programmer p2 = new Programmer("Maksat", 12000, 6, 0.35, 1.2);
        Programmer p3 = new Programmer("Zhiger", 11000, 5.5, 0.25, 1.8);
        Programmer p4 = new Programmer("Kuanish", 9000, 4.5, 0.4, 1.0);
        Programmer p5 = new Programmer("Talgat", 9500, 5.2, 0.32, 1.6);
        
        Teacher t1 = new Teacher("Aiman", 10000, 4.5, 0.3, 0.05);
        Teacher t2 = new Teacher("Sholpan", 8500, 4.2, 0.28, 0.03);
        Teacher t3 = new Teacher("Zere", 9000, 4.8, 0.35, 0.04);
        Teacher t4 = new Teacher("Aigul", 9500, 5.0, 0.32, 0.02);
        Teacher t5 = new Teacher("Zhazira", 10500, 5.3, 0.3, 0.01);

        Worker[] workers = {p1, p2, p3, p4, p5, t1, t2, t3, t4, t5};
        
        
        //Total work done by all workers in 5 hours
        double totalWork5Hours = 0;
        for (Worker worker : workers) {
            totalWork5Hours += worker.toWork(5);
        }

        //Total work done by all workers in 10 hours
        double totalWork10Hours = 0;
        for (Worker worker : workers) {
            totalWork10Hours += worker.toWork(10);
        }

        //Print total work done by each worker in 10 hours
        for (Worker worker : workers) {
            System.out.println(worker.getFullName() + " total work in 10 hours: " + worker.toWork(10) + " KJ");
        }

        //Find worker with maximum power
        Worker maxPowerWorker = workers[0];
        for (Worker worker : workers) {
            if (worker.getPower() > maxPowerWorker.getPower()) {
                maxPowerWorker = worker;
            }
        }

        //Find worker with maximum work done in 10 hours
        Worker maxWorkDoneWorker = workers[0];
        double maxWorkDone = maxWorkDoneWorker.toWork(10);
        for (Worker worker : workers) {
            double workDone = worker.toWork(10);
            if (workDone > maxWorkDone) {
                maxWorkDone = workDone;
                maxWorkDoneWorker = worker;
            }
        }

        System.out.println("Total work done by all workers in 5 hours: " + totalWork5Hours + " KJ");
        System.out.println("Total work done by all workers in 10 hours: " + totalWork10Hours + " KJ");
        System.out.println("Worker with maximum power: " + maxPowerWorker);
        System.out.println("Worker with maximum work done in 10 hours: " + maxWorkDoneWorker);
    }

	

}
