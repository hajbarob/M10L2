package scaner;

import scaner.readContent.FileContentReader;
import scaner.readContent.ScannerContentReader;
import scaner.scanFiles.DirScanner;
import scaner.scanFiles.RecursiveDirScanner;
import scaner.searchInContent.ContentSearcher;
import scaner.searchInContent.PrimitivContentSearcher;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class MainScaner {
    /*
    1) брати всі файли в поточній дерикторії на зберігати їх в ліст
    2) якщо в дерикторії є піддерикторія то ми виконуємо пенк 1 для неї
    3) в кожному файлі шукаємо входження перної фрази
    */

    public static void main(String[] args) throws IOException {
        DirScanner dirScanner = new RecursiveDirScanner();
        Collection<File> scan = dirScanner.scan(new File("./files"));

        FileContentReader fcr = new ScannerContentReader();
        ContentSearcher cs = new PrimitivContentSearcher();

        for (File file : scan) {
            String content = fcr.read(file);
            if(cs.search(content, "abra")) {
                System.out.println("abra found in file = " + file.getCanonicalPath());
            }
        }
    }
}
