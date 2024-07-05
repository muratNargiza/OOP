package lab9;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class T5 {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\kalyb\\eclipse-workspace\\OOPSummer\\files\\Salary.txt";
        String[] ranks = {"assistant", "associate", "full"};
        Random random = new Random();

        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = ranks[random.nextInt(ranks.length)];
                double salary = 0;
                	
                if(rank == "assistant") {
                	salary = 50000 + (30000 * random.nextDouble());
                    
                }
                else if(rank == "associate") {
                	salary = 60000 + (50000 * random.nextDouble());
                    
                }
                else if(rank == "full") {
                	salary = 75000 + (55000 * random.nextDouble());
                    
                }

                writer.write(String.format("%s %s %s %.2f%n", firstName, lastName, rank, salary));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}