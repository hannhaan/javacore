package Points;


public class Line {
    private Point d1;
    private Point d2;

    public Line (Point d1, Point d2){
        this.d1 = d1;
        this.d2 = d2;
    }
    public Line (int ax, int ay, int bx, int by){
        this.d1 = new Point(ax, ay);
        this.d2 = new Point(bx, by);
    }
    public void display() {
        System.out.print("Point 1: ");
        d1.display();
        System.out.print("Point 2: ");
        d2.display();
    }

    public void translate( int dx, int dy){
        d1.translate(dx, dy);
        d2.translate(dx, dy);
    }

    public double length() {
        return Math.sqrt(Math.pow(d2.getX() - d1.getX(), 2) + Math.pow(d2.getY() - d1.getY(), 2));
    }
}
