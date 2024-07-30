
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(7,"Blue");

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Diameter: " + circle.getDiameter());
    }
}