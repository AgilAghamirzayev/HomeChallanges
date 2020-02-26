package OOP3.Interfacess;

public class Eagle implements Animal, Bird {

    @Override
    public void eat() {
        System.out.println("Eats reptiles and amphibans");
    }

    @Override
    public void sound() {
        System.out.println("Has a high-pitched whistking soud");
    }

    @Override
    public void fly() {
        System.out.println("Flies up to 10,000 feet");
    }
}
