import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (InputStream bis = new BufferedInputStream(BufferedInputStreamExample.class.getClassLoader().getResourceAsStream(fileName))) {
            if (bis == null) {
                System.out.println("File not found in resources.");
                return;
            }

            int byteData;
            while ((byteData = bis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
