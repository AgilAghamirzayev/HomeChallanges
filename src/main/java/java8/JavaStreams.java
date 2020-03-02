package java8;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {

        //Integer stream
        System.out.println(
        IntStream
                .range(1,10)
                .skip(0)
                .sum());
              //  .forEach(System.out::print);
        System.out.println();

        // Stream of
        Stream.of("Aqil","Nazrin","Ayan")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        IntSummaryStatistics summary = IntStream.of(1,2,3,4)
                .summaryStatistics();
        System.out.println(summary);
    }
}
