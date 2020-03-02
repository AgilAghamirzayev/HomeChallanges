package LymabdaExperission;

import java.util.Comparator;

public class task5 {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

       int ccompare = stringComparator.compare("hello", "world");
        System.out.println(ccompare);

        Comparator<String> stringComparatorLambda =
                (o1, o2) -> o1.compareTo(o2);

        int lambdaCompare = stringComparatorLambda.compare("hello", "world");

        System.out.println(lambdaCompare);

    }
}
