package fileClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreateTest {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(new File("files/created-from-fos.txt"));

        fos.close();

        new File("files/file-without-fos.txt").createNewFile();

        new File("./files/newdir").mkdir();
        new File("./files/newdir2/humans").mkdirs();


        File dir = new File("./files/newdir2/humans");
        File file = new File(dir, "file-created-using-new-constructor.txt");
        file.createNewFile();
        System.out.println("file.exists() = " + file.exists());
    }
}
