import Points.Line;
import Points.Point;
import Points.ColoredPoint;

public class Main {
    public static void main(String[] args) {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(4, 6);
    Line line = new Line(p1, p2);

        line.display();
        line.translate(5, 3);
        System.out.println("After translation:");
        line.display();

        System.out.println("Length of the line: " + line.length());

        ColoredPoint cp = new ColoredPoint(5, 7, "green");
        cp.display();
}
}