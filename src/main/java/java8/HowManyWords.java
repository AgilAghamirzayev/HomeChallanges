package java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowManyWords {
    public static void main(String[] args) throws IOException {


        File file = new File("howMany");
        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> stringList = new LinkedList<>();
        Stream<String> lines = br.lines();
        lines.forEach(line -> {
            String[] splitted = line.split("[, ?.@]+\"");
            String key = splitted[0].trim();
            stringList.add(key);
        });

        List<String> words = stringList.stream()
                .filter(x -> x.equals("bir"))
                .collect(Collectors.toList());
        words.forEach(System.out::println);

    }
}
