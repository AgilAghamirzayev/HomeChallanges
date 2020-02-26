package setInJava;

import java.util.*;

public class Set_Example {
    public static void main(String[] args) {
//        Set<String> hashSet = new HashSet<String>();
//        hashSet.add("Aqil");
//        hashSet.add("Nazrin");
//        hashSet.add("Zeka");
//        hashSet.add("Aysu");
//        hashSet.add("Aqil");
//        System.out.println(hashSet);
//
//        Set<String> tree_Set = new TreeSet<String>(hashSet);
//        System.out.println(tree_Set);
//
//        List<String> arr = new ArrayList<String>(tree_Set);
//        System.out.println(arr);

        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{1,3,7,5,4,0,7,5}));

        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println(union);

        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println(intersection);


        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println(difference);
    }
}
