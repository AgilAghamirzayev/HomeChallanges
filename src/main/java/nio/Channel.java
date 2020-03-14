package nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class Channel {
    public static void main(String[] args) {
        String filename = "test.txt";
        try {
            FileInputStream fis = new FileInputStream(filename);
            try(FileChannel channel = fis.getChannel()){
                MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY,
                        0, channel.size());
                WritableByteChannel out = Channels.newChannel(System.out);
                while (buffer.hasRemaining()){
                    out.write(buffer);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
