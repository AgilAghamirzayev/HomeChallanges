package lesson8;

public class Trinagle extends Figure{
    Point p1;
    Point p2;
    Point p3;

    public Trinagle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public int area() {
        return Math.abs(p1.x-p2.x)*Math.abs(p1.y-p2.y);
    }
}
