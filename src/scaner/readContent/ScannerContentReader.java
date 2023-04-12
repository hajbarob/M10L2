package scaner.readContent;

import java.io.File;
import java.util.Scanner;
import java.util.StringJoiner;

public class ScannerContentReader implements FileContentReader {

    @Override
    public String read(File file) {
        StringJoiner sj = new StringJoiner("\n");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                sj.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION");
        }

        return sj.toString();
    }

}
