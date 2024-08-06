import java.io.*;

public class InputStreamReaderExample {
    public static void main(String[] args) {
        String inputFile = "example.txt";
        String outputFile = "uppercaseOutput.txt";

        try (InputStreamReader isr = new InputStreamReader(InputStreamReaderExample.class.getClassLoader().getResourceAsStream(inputFile));
             OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outputFile))) {

            if (isr == null) {
                System.out.println("Input file not found in resources.");
                return;
            }

            int charData;
            while ((charData = isr.read()) != -1) {
                osw.write(Character.toUpperCase((char) charData));
            }
            System.out.println("Data converted to uppercase and written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
