package java8;

import java.util.List;

interface A {
    void show();
}

//class Xyz implements A{
//    public void show(){
//        System.out.println("Hello");
//    }
//}
public class LamdaDemo {
    public static void main(String[] args) {
        A obj;
//        obj = new A(){
//            @Override
//            public void show() {
//                System.out.println("Hello");
//            }
//        };

        obj = () -> System.out.println("Hello");
        obj.show();

    }
}
