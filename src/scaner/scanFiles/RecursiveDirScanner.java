package scaner.scanFiles;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RecursiveDirScanner implements DirScanner {
    @Override
    public Collection<File> scan(File dir) {
        List<File> res = new ArrayList<>();
        recursiveScan(dir, res);
        return res;
    }

    private void recursiveScan(File dir, Collection files) {
        for (File fileOrDir : dir.listFiles()) {
            if(fileOrDir.isDirectory()) {
                recursiveScan(fileOrDir, files);
            } else {
                files.add(fileOrDir);
            }
        }
    }
}
