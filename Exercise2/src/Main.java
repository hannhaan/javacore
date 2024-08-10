public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        p1.changePoint(1, 10);
        p1.display();
        System.out.println("Khoang cach p1 den toa do O la: " + p1.distanceFromOrigin());

        Point p2 = new Point(-10, - 78);
        System.out.println("Khoang cach p2 den p1 la: " + p2.distanceFrom(p1));

        Point pointSymmetricOx = p1.symmetricAcrossOx();
        pointSymmetricOx.display();

        Point pointSymmetricOy = p1.symmetricAcrossOy();
        pointSymmetricOy.display();
    }
}
