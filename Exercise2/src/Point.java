public class Point {
    private int x;
    private int y;

    Point(){
    }
    Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
    public void changePoint(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    public float distanceFromOrigin() {
        return (float) Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public float distanceFrom(Point p){
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public Point symmetricAcrossOx() {
        return new Point(this.x, -this.y);
    }

    public Point symmetricAcrossOy() {
        return new Point(-this.x, this.y);
    }
}
