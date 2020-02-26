package hometask.hw4;

import java.util.Arrays;

public class Pet {
    public String species;
    public  String nickName;
    public int age;
    public int trickLevel;
    public static String[] habits = new String[]{"eat", "drink", "sleep"};

    public Pet(String species, String nickName){
        this.species = species;
        this.nickName=nickName;
    }

    public Pet(String species, String nickName, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(){

    }

    public  void eat(){
        System.out.println("I am eating");
    }

    public  void respond(){
        System.out.println("Hello, owner " + nickName + ". I miss you");
    }

    public  void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}",species, nickName, age, trickLevel, Arrays.toString(habits));
    }
}
