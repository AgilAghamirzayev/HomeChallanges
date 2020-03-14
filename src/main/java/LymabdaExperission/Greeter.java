package LymabdaExperission;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaE = ()-> System.out.println("Hello");


        helloWorldGreeting.perform();
        lambdaE.perform();

    }

}
