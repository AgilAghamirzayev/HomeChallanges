package LymabdaExperission;

import java.io.IOException;
import java.io.OutputStream;

public interface MyInterface {
    void printIt(String text);

    default public   void printUtf8To(String text, OutputStream outputStream){
        try {
            outputStream.write(text.getBytes("UTF-8"));
        } catch (IOException e){
            throw new RuntimeException("Something goes wrong");
        }
    }

    static void printItTOSystemOut(String text){
        System.out.println(text);
    }
}
