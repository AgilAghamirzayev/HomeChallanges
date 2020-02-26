package hometask.hw4;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", "rock",  5, 75, Pet.habits);
        Human father = new Human("Shakir", "Aghamirzayev", 1964);
        Human mother = new Human("Afat", "Aghamirzayeva", 1968);
        Human child = new Human("Aqil","Aghamirzayev",1999, 110, dog, mother, father,Human.schadule);
        System.out.println(child.toString());
        System.out.println(dog.toString());
        dog.eat();
        dog.respond();
        dog.foul();
        child.describePet();
        child.greetPet();


    }
}
