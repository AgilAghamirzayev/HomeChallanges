package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuem {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Aqil");
        queue.add("Nazrin");
        queue.add("Lale");

        System.out.println("Head: " + queue.element());
        System.out.println("Head: " + queue.peek());

        Iterator itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("remove");

        queue.remove();
        Iterator itrb = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itrb.next());
        }

        queue.poll();
        System.out.println("After removing elements");

        Iterator itra = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itra.next());
        }

    }

}
