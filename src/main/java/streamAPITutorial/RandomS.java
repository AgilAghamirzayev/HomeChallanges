package streamAPITutorial;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomS {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream intStream = random.ints(10);
        System.out.println();
    }
}
