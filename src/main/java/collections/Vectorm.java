package collections;

import java.util.Iterator;
import java.util.Vector;

public class Vectorm {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Aqil");
        v.add("Nazrin");

        Iterator<String> itr = v.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
