package lab9;
import java.util.*;
import java.io.*;

public class T2 {

	public static void main(String[] args) {
		String currentDirectory = "C:\\Users\\kalyb\\eclipse-workspace\\OOPSummer\\files";
		
		String fileName = "LabWork9.txt";
        File file = new File(currentDirectory, fileName);
        System.out.println(file.getAbsolutePath());
        Random random = new Random();
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                for (int i = 0; i < 100; i++) {
                    writer.write(random.nextInt(100) + 1 + " ");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
        }

        try (Scanner scanner = new Scanner(file)) {
            int[] integers = new int[100];
            int count = 0;
            while (scanner.hasNextInt()) {
                if (count < 100) {
                    integers[count++] = scanner.nextInt();
                } else {
                    break;
                }
            }
            for (int i = 0; i < count - 1; i++) {
                for (int j = 0; j < count - 1 - i; j++) {
                    if (integers[j] > integers[j + 1]) {
                        int temp = integers[j];
                        integers[j] = integers[j + 1];
                        integers[j + 1] = temp;
                    }
                }
            }

            System.out.print("Sorted integers: ");
            for (int i = 0; i < count; i++) {
                System.out.print(integers[i] + " ");
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
        
       

	}

}
