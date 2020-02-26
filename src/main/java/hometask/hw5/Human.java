package hometask.hw5;
public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private   String[][] schadule = new String[][]{
            {"monday", "go to work"},
            {"tuesday", "go to university"},
            {"wednesday", "doing exercises"},
            {"thursday", "go to course"},
            {"friday", "go to mosque"},
            {"saturday", "go to course"},
            {"sunday", "take a rest"}
    };


    public Human(String name, String surname, int year, int iq,int day, String task) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.setSchadule(day, task);
    }

    public void setSchadule(int day, String task) {
        this.schadule[day-1][1] = task;
    }

    public String[][] getSchadule() {
        return schadule;
    }

    public void feed(){
        System.out.println("to feed");
    }

    public void describe(){
        System.out.println("describe favorite");
    }

    public void greet(){
        System.out.println("greet pet");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                '}';
    }
}
