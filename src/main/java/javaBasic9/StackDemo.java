package javaBasic9;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    static void  showpush(Stack st, int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack st){
        System.out.println("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("stack: " + stack);
        showpush(stack, 10);
        showpush(stack, 20);
        showpush(stack, 30);
        showpop(stack);
        showpop(stack);
        showpop(stack);
        try {
            showpop(stack);
        } catch (EmptyStackException e){
            System.out.println("empty stack");
        }
    }
}
