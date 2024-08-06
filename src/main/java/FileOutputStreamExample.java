import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String fileName = "output.txt"; // Specify the file name
        String data = "This is a sample text."; // The string to write to the file

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes()); // Convert string to bytes and write to file
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace(); // Handle exception
        }
    }
}
