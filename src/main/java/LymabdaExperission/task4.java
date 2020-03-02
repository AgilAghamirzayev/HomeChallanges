package LymabdaExperission;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class task4 {
    public static void main(String[] args) {
        List<String> listOfString = new LinkedList<>();
        listOfString.add("Aqil");
        listOfString.add("Nazrin");
        listOfString.add("Ayan");
        listOfString.add("Orxan");
        listOfString.add("Lale");
        listOfString.add("Ay");
        listOfString.add("A");

        ArrayList<String> stringWithLengthGreaterThanTwo =
                listOfString
                .stream()
                .filter(s->s.length()>2)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(stringWithLengthGreaterThanTwo);
    }
}
