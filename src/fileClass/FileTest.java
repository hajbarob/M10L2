package fileClass;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {
        File file = new File("./files/in-files.txt");
        File dir = new File("./files");

        System.out.println("dir.isDirectory() = " + dir.isDirectory());

        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.getParentFile() = " + file.getParentFile());

        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());

        File[] files = dir.listFiles();
        // listFiles return null but not empty array if there is child dir or files
        for (File f : files) {
            System.out.println("f = " + f.getCanonicalPath());
            System.out.println("f isFile = " + f.isFile());
            System.out.println("f isDirectory = " + f.isDirectory());
        }

    }
}
