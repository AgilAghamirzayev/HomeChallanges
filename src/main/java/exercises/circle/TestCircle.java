package exercises.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        circle.setColor("blue");
        System.out.println(circle.toString());

        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println(circle1);

        Circle circle2 = new Circle(3,"green");
   //     circle2.getColor();
        System.out.println(circle2);
    }

}
