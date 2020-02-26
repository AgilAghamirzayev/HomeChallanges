package collections;

import java.util.*;
import java.util.stream.Stream;

public class Sett {

    public static void main(String[] args) {
     //   Set<String> setA = new EnumSet<String>();
        Set<String> setB = new HashSet<>();
        Set<String> setC = new LinkedHashSet<>();
        Set<String> setD = new TreeSet<>();

        setB.add("A");
        setB.add("C");
        setB.add("D");
        setB.add("A");
        setB.add("C");
        setB.add("D");

        Iterator iterator = setB.iterator();
        while (iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.println(element);
        }

        Stream stream = setB.stream();

        stream.forEach((element) ->{ System.out.println(element); });

        setC.addAll(setB);
        setC.add("E");
        setD.addAll(setC);
    }
}
