package exercises.circle;

public class Circle {
    private double radius;
    private String color ;

    Circle(){
        radius = 1.0;
        color = "red";
    }

    Circle(double r){
        this.radius = r;
    }

    public Circle(double r, String c){
        this.radius=r;
        this.color=c;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circlre [ radius = " + radius + " color = " + color + " ]";
    }
}
