package LymabdaExperission;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class task1 {
    public static void main(String[] args) {
//
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("My runnable");
//            }
//        };
//
//        Runnable r1 = () -> System.out.println("My runnable");

        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 30 ; i++) {
            numbers.add(i);
        }

        sumWithCondition(numbers, n -> true);
        sumWithCondition(numbers, i -> i%2 == 0);
        sumWithCondition(numbers, i -> i>5);
        sumWithCondition(numbers, n -> n%2==1);
    }

    public static void sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate){
        System.out.println(numbers.parallelStream()
                .filter(predicate)
                .mapToInt(i -> i)
                .sum());
    }
//
//    public static int findSquareOfMaxOdd(List<Integer> numbers){
//        int max = 0;
//        for (int i: numbers) {
//            if (i%2!=0 && i>3 && i<11 && i>max){
//                max=i;
//            }
//        }
//        return max*max;
//    }
//
//    public static boolean isOdd(int i){
//        return i%2!=0;
//    }
//
//    public static boolean isGreatherThan3(int i){
//        return i>3;
//    }
//
//    public static boolean isLessThan11(int i){
//        return i < 11;
//    }
}
