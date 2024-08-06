import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        String inputFile = "example.txt"; // In resources
        String outputFile = "reversedOutput.txt"; // Output file

        try (InputStream is = FileReaderWriterExample.class.getClassLoader().getResourceAsStream(inputFile);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            if (is == null) {
                System.out.println("Input file not found in resources.");
                return;
            }

            List<String> lines = new ArrayList<>();
            String line;
            // Read lines into a list
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            // Reverse the list
            Collections.reverse(lines);
            // Write lines in reverse order
            for (String reversedLine : lines) {
                writer.write(reversedLine);
                writer.newLine();
            }
            System.out.println("File content reversed and written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
