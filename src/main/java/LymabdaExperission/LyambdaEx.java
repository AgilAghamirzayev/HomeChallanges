package LymabdaExperission;

public class LyambdaEx {
    public static void main(String[] args) {

        MyFunction myFunction = (text1, text2) -> text1 + " + " +text2;
        String returnValue = myFunction.apply("Hello Fuction Body","Test ");
        System.out.println(returnValue);

        MyFunction myFunction1 = myFunction;
        String re = myFunction1.apply("text1","text2");
        System.out.println(re);
    }
}