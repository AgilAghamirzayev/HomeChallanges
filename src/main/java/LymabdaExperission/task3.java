package LymabdaExperission;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {

        List<String> listOfString = new LinkedList<>();
        listOfString.add("Aqil");
        listOfString.add("Nazrin");
        listOfString.add("Ayan");
        listOfString.add("Orxan");
        listOfString.add("Lale");

        Map<String, Integer> stringToLength =
                listOfString
                .stream()
                .collect(
                        Collectors.toMap(Function.identity(), String::length)
                );

        System.out.println(stringToLength);
    }
}
