package scaner.scanFiles;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class FileScannerTest {

    public static void main(String[] args) throws IOException {
        DirScanner scanner = new RecursiveDirScanner();

        Collection<File> files = scanner.scan(new File("./files"));

        for (File f : files) {
            System.out.println("f.getCanonicalPath() = " + f.getCanonicalPath());
        }
    }
}
