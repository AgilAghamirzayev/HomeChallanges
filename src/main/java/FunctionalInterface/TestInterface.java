package FunctionalInterface;
@FunctionalInterface
public interface TestInterface {
    public abstract void show(int n);
    public static void hello(){
        System.out.println("Static method");
    }
    public default void test(){
        System.out.println("default method");
    }
}
