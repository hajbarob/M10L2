package scaner.readContent;

import java.io.File;

public class FileContentReaderTest {

    public static void main(String[] args) {

        FileContentReader fcr = new ScannerContentReader();

        String read = fcr.read(new File("./files/in-files.txt"));

        System.out.println(read);

    }
}
