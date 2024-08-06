import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        String fileName = "data.bin";

        // Write data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(123);
            dos.writeFloat(4.56f);
            dos.writeBoolean(true);
            dos.writeChar('A');
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int intValue = dis.readInt();
            float floatValue = dis.readFloat();
            boolean booleanValue = dis.readBoolean();
            char charValue = dis.readChar();
            System.out.println("Read data: " + intValue + ", " + floatValue + ", " + booleanValue + ", " + charValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
