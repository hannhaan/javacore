
public class Circle {
    double radius;
    String color;
    final float PI = 3.14F;

    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return radius * radius * PI;
    }

    public double getDiameter(){
        return radius * 2 * PI;
    }
}
