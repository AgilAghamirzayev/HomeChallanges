package fileInputStream;

import java.io.File;

public class Class3 {
    public static void main(String[] args) {
        File dir = new File("D:\\IBA\\HomeChallanges\\src\\main\\java\\fileInputStream\\filem");
        listRecursive(dir);
    }

    private static void listRecursive(File dir) {
        if (dir.isDirectory()) {
            File[] items = dir.listFiles();
            for (File item : items) {
                System.out.println(item.getAbsoluteFile());
                if (item.isDirectory()) listRecursive(item);
            }
        }
    }
}
