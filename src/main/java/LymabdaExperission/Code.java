package LymabdaExperission;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code {
    public static void main(String[] args) {
        List<String> listOFString = Arrays.asList("Java","C","C++","Go",
                "JavaScript","Python","Scala");

        System.out.println("input list of String: " + listOFString);

        // Example 1 - converting Stream to List using collect() method
        List<String> listOfStringStartsWithJ =
                listOFString
                .stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("list Of String Starts With J: " + listOfStringStartsWithJ);

        //Example 2 - converting to set
        Set<String> setOfStringStartsWithC=
                listOFString.stream()
                .filter(s->s.startsWith("C"))
                .collect(Collectors.toSet());

        System.out.println("list Of String Starts With C: " + setOfStringStartsWithC);

        // Example 3 - converting Stream to Map
        Map<String , Integer> stringToLength =
                listOFString.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println("map of string and their length: " + stringToLength);

        // Example - Converting Stream to Collection e.g. ArrayList
        ArrayList<String> stringWithLengthGreaterThanTwo =
                listOFString.stream()
                .filter(s->s.length()>2)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("collection of String with length greater than 2: "
                + stringWithLengthGreaterThanTwo);
    }
}
