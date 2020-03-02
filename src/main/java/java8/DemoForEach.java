package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class DemoForEach {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5,6,-1,-2,-3,-4,-5,-6);
        a.forEach(System.out::println);

       // Consumer<Integer> c = i -> System.out.println(i);

        Stream<Integer> s = a.stream();
        s.filter(i->i>0).forEach(System.out::println);
        s.filter(i->i<0).forEach(System.out::println);
//        s.forEach(i -> System.out.println(i));
//        s.forEach(System.out::println);
//        s.forEach(System.out::println);
//        s.forEach(System.out::println);
    }
}
