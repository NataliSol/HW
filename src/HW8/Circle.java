package HW8;


public class Circle extends Figure {
    private final double radius;
    private final String type;
    private final double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.type = "circle";
        this.area = area();
    }

    public double area() {
                return PI * radius* radius;
    }

    public void draw() {
        System.out.println("Figure: " + type + ", " + "area: " + String.format("%.2f", area)
                + ", sq.units, " + "radius: " + String.format("%.2f", radius) + ", color: " + color);
    }
}

