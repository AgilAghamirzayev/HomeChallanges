package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowManyWords {
    public static void main(String[] args) throws IOException {
        List<String> words = Files.lines(Paths.get("howMany.txt"))
                .filter(x -> x=="bir")
                .collect(Collectors.toList());
        words.forEach(System.out::println);


    }


}
