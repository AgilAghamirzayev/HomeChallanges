package OOP3.Abstract;

public class TestAnimal {
    public static void main(String[] args) {
        Animal myBird = new Bird();
        myBird.label();
        myBird.eat();
        myBird.move();

        System.out.println();

        Animal myFish = new Fish();
        myFish.label();
        myFish.eat();
        myFish.move();
    }
}
