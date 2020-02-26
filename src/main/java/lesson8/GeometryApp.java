package lesson8;

import java.util.ArrayList;

public class GeometryApp {
    public static void main(String[] args) {
        Figure circle = new Circle(new Point(2,3),1);
        Figure rectangle = new Rectangle(new Point(1,2), new Point(3,4));
        Figure trinagle = new Trinagle(new Point(1,2), new Point(4,2), new Point(1,4));
        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(circle);
        figures.add(rectangle);
        figures.add(trinagle);

        int total_area = 0;
        for (Figure f: figures) {
            total_area+=f.area();
            System.out.println(f.area());
        }

        System.out.println(total_area);
    }
}
