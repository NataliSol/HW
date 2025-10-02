package HW8;

public class IsoscelesTrapezoid extends Figure {
    private final String type;
    private final double top;
    private final double bottom;
    private final double height;
    private final double area;

    public IsoscelesTrapezoid(String color, double top, double bottom, double height) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
        this.type = "isosceles trapezoid";
        this.area = area();
    }

    public double area() {
        return ((top+bottom)*height)/2;
    }

    public void draw() {
        System.out.println("Figure: " + type + ", " + "area: " + String.format("%.2f", area) +
                ", sq.units, " + " top: " + String.format("%.2f", top) + " bottom: " +
                String.format("%.2f", bottom) + "+" + " height: " + String.format("%.2f", height)+ ", color: " + color);
    }
}