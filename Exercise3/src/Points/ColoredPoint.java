package Points;

public class ColoredPoint extends Point{
    private String color;
    public ColoredPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Color: " + color);
    }
}
