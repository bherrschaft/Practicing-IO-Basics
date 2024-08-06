import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String fileName = "bufferedOutput.txt";
        String data = "This is a sample text using buffered output.";

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName))) {
            bos.write(data.getBytes());
            System.out.println("Data written to file successfully with buffering.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
