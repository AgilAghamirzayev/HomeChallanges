package optional;

import ComparableandComparator.Employee;
import sun.net.www.http.HttpClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ParallelStreams {
    public static void main(String[] args) {
        long t1, t2;
        List<Employee> eList =new ArrayList<Employee>();
        for (int i = 0; i < 100 ; i++) {
                eList.add(new Employee("A",1000));
                eList.add(new Employee("B",200));
                eList.add(new Employee("C",4200));
                eList.add(new Employee("D",400));
                eList.add(new Employee("E",2020));
                eList.add(new Employee("F",90000));
                eList.add(new Employee("F",90000));

        }


     //   IntStream.iterate(1,i->i<100,i->i+1).forEach(System.out::println);

        t1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count?= " + eList.stream().filter(e->e.getSalary()>1500).count());

        t2= System.currentTimeMillis();
        System.out.println("Sequential Stream Time taken?= " + (t2-t1) +"\n");

        t1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count = " + eList.parallelStream().filter(e->e.getSalary()>1500).count());

        t2 = System.currentTimeMillis();
        System.out.println("Parallel Stream Time Token?= " + (t2-t1));
    }
}
