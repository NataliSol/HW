package HW8;

public class RightTriangle extends Figure {
    private final String type;
    private final double firstLeg;
    private final double secondLeg;
    private final double area;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.type = "right triangle";
        this.area = area();
    }

    public double area() {
        return 0.5*firstLeg * secondLeg;
    }

    public void draw() {
        System.out.println("Figure: " + type + ", " + "area: " + String.format("%.2f", area) +
                ", sq.units, " + " firstLeg: " + String.format("%.2f", firstLeg)
                + " secondLeg: " + String.format("%.2f", secondLeg) + ", color: " + color);
    }
}

