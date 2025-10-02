package HW8;

public class FigureSupplier {

    private double randomSize() {
        return Math.random() * 20 + 1;
    }

    public Figure getRandomFigure(ColorSupplier color) {
        double randomFirst = randomSize();
        double randomSecond = randomSize();
        double randomThird = randomSize();

        int randomFigure = (int) (Math.random() * 5) + 1;


        return switch (randomFigure) {
            case 1 -> new Circle(color.getRandomColor(), randomFirst);
            case 2 -> new Square(color.getRandomColor(), randomFirst);
            case 3 -> new Rectangle(color.getRandomColor(), randomFirst, randomSecond);
            case 4 -> new RightTriangle(color.getRandomColor(), randomFirst, randomSecond);
            case 5 -> new IsoscelesTrapezoid(color.getRandomColor(), randomFirst, randomSecond, randomThird);
            default -> throw new IllegalStateException("Unexpected value: " + randomFigure);
        };
    }
        public Figure getDefaultFigure () {
            return new Circle("white", 100.00);
        }
    }






