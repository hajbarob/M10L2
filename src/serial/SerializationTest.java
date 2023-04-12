package serial;

import java.io.*;

public class SerializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeToFile();
        readFromFile();
    }

    public static void writeToFile() throws IOException, ClassNotFoundException {
        Human olda = new Human("Olda", "088789878");

        OutputStream os = new FileOutputStream(new File("files/serial.bin"));
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(olda);

        oos.flush();
        oos.close();
    }

    public static void readFromFile() throws IOException, ClassNotFoundException {
        File file = new File("files/serial.bin");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object o = ois.readObject();
        System.out.println("o.toString() = " + o.toString());
    }
}
