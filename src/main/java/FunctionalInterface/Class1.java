package FunctionalInterface;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Class1 {
//    @Override
//    public void run() {
//        System.out.println("thread running");
//    }
//
//    public static void main(String[] args) {
//        Thread t = new Thread(new Class1());
//        t.start();
//    }



    public static int sumIterator(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        int sum=0;
        while (it.hasNext()){
            int num = it.next();
            if (num>10){
                sum =+ num;
            }
        }
        return sum;
    }

    public static int sumStream(List<Integer> list){
        return list.stream().filter(i->i>10).mapToInt(i->i).sum();
    }

    public static void main(String[] args) {
        Runnable run = ()-> System.out.println("Thread");
        Thread t = new Thread(run);
        t.start();

        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4}); // fine
       // Stream<Integer> stream2 = Stream.of(new int[]{1,2,3,4}); error


        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i <100 ; i++) myList.add(i);

        Stream<Integer> sequentialStream = myList.stream();
        Stream<Integer> paralelStream = myList.stream();

        Stream<String> stream2 = Stream.generate(()->"abc");
        Stream<String> stream3 = Stream.iterate("abc",(i)->i);

        LongStream is = Arrays.stream(new long[]{1,2,3,4});
        IntStream is2 = "abc".chars();

        Stream<Integer> intStream = Stream.of(1,2,3,4);
        List<Integer> intList = intStream.collect(Collectors.toList());

        intStream = Stream.of(1,2,3,4);
        Map<Integer, Integer> intMap = intStream.collect(Collectors.toMap(i->i, i->i+10));
        System.out.println(intMap);

        Stream<Integer> intStreamm = Stream.of(1,2,3,4);
        Integer[] intArray = intStreamm.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray));



        //Intermediate operators

        List<Integer> myList1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) myList.add(i);
        Stream<Integer> sequencialStreamm = myList.stream();
        Stream<Integer> highNums = sequencialStreamm.filter(p->p>90);
        highNums.forEach(s-> System.out.print(s+", "));
        System.out.println();
        Stream<String> names = Stream.of("abc","d","ef");
        System.out.println(names.map(s -> s.toUpperCase())
        .collect(Collectors.toList()));

        Stream<String> names2 = Stream.of("aBc", "d", "ef","123456");
        List<String> reveseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reveseSorted);

        Stream<String> names3 = Stream.of("aBc", "d", "ef","123456");
        List<String> naturalsorted = names3.sorted().collect(Collectors.toList());
        System.out.println(naturalsorted);


        Stream<List<String>> namesOrginalList = Stream.of(
                Arrays.asList("Aqil"),
                Arrays.asList("Nazrin"),
                Arrays.asList("Gunay"));

        Stream<String> flatStream = namesOrginalList.flatMap(strList->strList.stream());
        flatStream.forEach(System.out::println);

        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Optional<Integer> intOptional = numbers.reduce((i,j)->i*j);

        if (intOptional.isPresent()) System.out.println("Multiplication = " + intOptional.get());

    }
}

