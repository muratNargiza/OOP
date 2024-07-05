package lab9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T6 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String currentDirectory = "C:\\Users\\kalyb\\eclipse-workspace\\OOPSummer\\files";
        System.out.print("Enter the file name: ");
        String fileName = inputScanner.nextLine();
        
        File file = new File(currentDirectory, fileName);
        
        Map<Character, Integer> letterCount = new HashMap<>();
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
            letterCount.put(ch, 0);
        }
        
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase();
                
                for (char ch : line.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        letterCount.put(ch, letterCount.get(ch) + 1);
                    }
                }
            }
            
            for (char ch = 'a'; ch <= 'z'; ch++) {
                int count = letterCount.get(ch);
                if (count > 0) {
                    System.out.println(ch + ": " + count);
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } finally {
            inputScanner.close();
        }
    }
}
