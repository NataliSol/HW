package HW8;


public class Rectangle extends Figure {
    private final String type;
    private final double firstLeg;
    private final double secondLeg;
    private final double area;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.type = "rectangle";
        this.area = area();
    }

    public double area() {
        return firstLeg * secondLeg;
    }

    public void draw() {
        System.out.println("Figure: " + type + ", " + "area: " + String.format("%.2f", area) +
                ", sq.units, " + "first leg: " + String.format("%.2f", firstLeg) +
                " secondLeg: " + String.format("%.2f", secondLeg) + ", color: " + color);
    }
}