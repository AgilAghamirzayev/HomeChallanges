package fileInputStream;

import java.io.File;
import java.io.FilenameFilter;

public class Class4 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            String[] files = dir.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String file) {
                    return file.endsWith(".java");
                }
            });
            for (String file: files){
                System.out.println(file);
            }
        }
    }
}
