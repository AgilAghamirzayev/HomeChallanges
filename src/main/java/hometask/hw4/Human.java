package hometask.hw4;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    public  static String[][] schadule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schadule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schadule = schadule;
    }

    public void Human(){

    }
    public  void greetPet(){
        System.out.println("Hello, "+pet.nickName);
    }

    public    void  describePet(){
        if (pet.trickLevel>=50)
        System.out.println("I have a "+ pet.species + " he is " + pet.age +
                " he is very sly");
        else System.out.println("I have a "+ pet.species + " he is " + pet.age +
                " he is almost not sly");
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, mother= %s %s, father=%s %s, pet=%s",
    name, surname, year, iq, mother.name,mother.surname, father.name, father.surname, pet);
    }
}
