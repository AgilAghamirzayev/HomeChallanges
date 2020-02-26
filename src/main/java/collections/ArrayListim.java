package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListim {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Aqil");
        arrayList.add("Nazrin");



        Iterator itr = arrayList.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
