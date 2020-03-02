package anonymousInnrClass;

public class AnonymousDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.getAge();


        Age obj1 = new Age() {
            @Override
            public void getAge() {
                System.out.println("Age is " + x);
            }
        };
        obj1.getAge();
    }
}
