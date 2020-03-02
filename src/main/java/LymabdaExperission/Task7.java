package LymabdaExperission;

public class Task7 {
    public static void main(String[] args) {
        MyFactory myFactory = String::new; // String::new = chars -> new String(chars)
        String myString = "Test";

        MyFactory  myFactory1 = chars -> myString + ":" + new String(chars);

        System.out.println(myFactory);
        System.out.println(myFactory1);
    }
}
