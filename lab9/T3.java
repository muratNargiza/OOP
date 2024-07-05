package lab9;

import java.io.*;
import java.util.Scanner;

public class T3 {

    public static void main(String[] args) {
        String currentDirectory = "C:\\Users\\kalyb\\eclipse-workspace\\OOPSummer\\files";
        String fileName = "WordRemove.txt";
        File file = new File(currentDirectory, fileName);
        System.out.println(file.getAbsolutePath());

        String combinationToRemove = "Diyas";  

        try {
            File tempFile = new File(file.getAbsolutePath() + ".tmp");
            try (Scanner scanner = new Scanner(file); PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String modifiedLine = line.replace(combinationToRemove, "");
                    writer.println(modifiedLine);
                }
            }

            if (!file.delete()) {
                System.out.println("Не удалось удалить оригинальный файл");
                return;
            }

            if (!tempFile.renameTo(file)) {
                System.out.println("Не удалось переименовать временный файл");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
