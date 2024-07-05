package lab9;
import java.io.*;
import java.util.*;

public class T4 {

    public static void main(String[] args) {
        String currentDirectory = "C:\\Users\\kalyb\\eclipse-workspace\\OOPSummer\\files";
        String fileName = "SortedStrings.txt";
        File file = new File(currentDirectory, fileName);
        System.out.println(file.getAbsolutePath());

        try (Scanner scanner = new Scanner(file)) {
            String previousLine = null;
            int lineNumber = 0;
            boolean sorted = true;

            while (scanner.hasNextLine()) {
                String currentLine = scanner.next();
                lineNumber++;

                if (previousLine != null && previousLine.compareTo(currentLine) > 0) {
                    System.out.println("Strings are not sorted in increasing order.");
                    System.out.println("First unsorted strings are: ");
                    System.out.println("Line " + (lineNumber - 1) + ": " + previousLine);
                    System.out.println("Line " + lineNumber + ": " + currentLine);
                    sorted = false;
                    break;
                }
                previousLine = currentLine;
            }

            if (sorted) {
                System.out.println("All strings are sorted in increasing order.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
            e.printStackTrace();
        }
    }
}