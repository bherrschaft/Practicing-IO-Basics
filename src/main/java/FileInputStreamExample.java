import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String fileName = "example.txt"; // Specify the file name

        try (InputStream fis = FileInputStreamExample.class.getClassLoader().getResourceAsStream(fileName)) {
            if (fis == null) {
                System.out.println("File not found in resources.");
                return;
            }

            int byteData;
            // Read the file byte by byte
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Convert byte to char and print
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle exception
        }
    }
}
