package fileInputStream;

import java.io.*;
import java.net.URI;
import java.net.URL;

public class Class5 {
    public static void main(String[] args) throws IOException {
        File path = new File("hello.txt");
        System.out.println("We got a file: " + path);

        System.out.println("Does it exist? " + path.exists());
        System.out.println("Wat? " + path.isDirectory());



//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
//        String line=reader.readLine();
//        System.out.println("read a line: " + line);
        OutputStream outputStream = new FileOutputStream(path);


        URL url = new URL("https://www.gutenberg.org/files/16247/16247.txt");
        InputStream stream = url.openStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line = reader.readLine();
        while (line!=null) {
           // System.out.println(line);
            outputStream.write(line.getBytes());
            line = reader.readLine();
            System.out.println(line);
        }
        System.out.println("Done Reading!");

        path.delete();

        outputStream.close();


    }
}
