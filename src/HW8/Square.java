package HW8;

public class Square extends Figure{
    private final String type;
    private final double side;
    private final double area;

    public Square(String color,double side) {
        super(color);
        this.side=side;
        this.type="square";
        this.area=area();
    }

    @Override
    public double area() {
        return side*side;
    }
    public void draw() {
        System.out.println("Figure: " + type + ", " + "area: " + String.format("%.2f", area) +
                " sq.units, " + "side: " +  String.format("%.2f", side) + ", color: " + color);
    }
}
