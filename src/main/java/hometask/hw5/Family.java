package hometask.hw5;

public class Family {
    private Human mother;
    private Human father;
    private static Human[] children = new Human[10];
    private  Pet pet;
    private static int countFamily;
    private static int count=0;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.countFamily=2;
    }

    public  void addChild(Human child){
        children[count++] = child;
        countFamily++;
    }

    public void deleteChild(int a){
        Human[] c = new Human[]{};
        children[a]=null;
        c=children;
        children=c;
        count--;
        countFamily--;
    }

    public Human getMother() {
        return mother;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                '}';
    }
}
