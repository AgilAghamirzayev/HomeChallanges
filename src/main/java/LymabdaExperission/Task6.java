package LymabdaExperission;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Task6 {
    public static void main(String[] args) throws FileNotFoundException {
        MyInterface myInterface = text -> System.out.println(text);

        myInterface.printIt("Hello World");

        myInterface.printUtf8To("Hello Aqil", new FileOutputStream("data.txt"));

        MyInterface.printItTOSystemOut("Hello Aqil");
    }
}
