package fileInputStream;

import java.io.*;

public class Class2 {

    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        if (args.length<2){
            System.out.println("Plese provide input and output files");
            System.exit(0);
        }
        String inputFile = args[0];
        String outputFile = args[1];

        try (
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
            ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(buffer))!=-1){
                outputStream.write(buffer, 0, bytesRead);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
