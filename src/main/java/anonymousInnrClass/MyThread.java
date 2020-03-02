package anonymousInnrClass;

public class MyThread {
    public static void main(String[] args) {


        //Anonymous Inner class that defines inside method/constructor argument :
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Child Thread");
            }
        });

        t.start();
        System.out.println("Main Thread");

        //Anonymous Inner class that implements a interface :
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Child Thread2");
//            }
//        };
//        Thread t = new Thread(r);
//        t.start();
//        System.out.println("Main Thread");

//Anonymous Inner class that extends a class :
//        Thread t = new Thread(){
//            public void run(){
//                System.out.println("Child Thread");
//            }
//        };
//        t.start();
//        System.out.println("Main Thread");
    }
}
