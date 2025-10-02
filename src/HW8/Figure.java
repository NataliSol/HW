package HW8;

public abstract class Figure {
    public static final double PI = 3.14;
    String color;


    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double area();
}

