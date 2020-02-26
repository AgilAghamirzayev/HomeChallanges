package collections;

import java.util.Iterator;
import java.util.Stack;

public class Stackm {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.add("Aqil");
        s.add("Nazrin");
        s.push("Aqil");
        s.push("Nazrin");
        s.pop();
        s.peek();

        Iterator<String> itr = s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
