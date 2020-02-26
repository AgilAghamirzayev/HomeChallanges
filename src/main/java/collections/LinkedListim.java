package collections;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListim {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Aqil");
        al.add("Nazrin");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
