package LymabdaExperission;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {


        List<String> listOfString = new LinkedList<>();
        listOfString.add("A");
        listOfString.add("B");
        listOfString.add("C");
        listOfString.add("Jack");
        listOfString.add("June");
        listOfString.add("Qc");
        listOfString.add("J");
        listOfString.add("Cek");
        Collectors.toList();


        List<String> listOfStringStarsWithJ = listOfString
                .stream()
                .filter(s -> s.startsWith("J"))
                .filter(s -> s.endsWith("e"))
                .collect(Collectors.toList());

        Set<String> setOfStringStartsWithC = listOfString
                .stream()
                .filter(s -> s.startsWith("C"))
                .collect(Collectors.toSet());

        System.out.println(listOfStringStarsWithJ);
        System.out.println(setOfStringStartsWithC);


    }
}
