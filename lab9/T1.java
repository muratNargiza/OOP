package lab9;
import java.io.*;
import java.util.Scanner;
public class T1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String currentDirectory = "C:\\Users\\kalyb\\eclipse-workspace\\OOPSummer\\files";
        System.out.print("Enter the file name: ");
        String fileName = input.nextLine();
        File file = new File(currentDirectory, fileName);

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);

        input.close(); 
	}

}
