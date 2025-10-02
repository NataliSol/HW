package HW8;

import java.util.ArrayList;

public class Main {

    public static void addFigures(ArrayList<Figure> figureArrayList, FigureSupplier supplier, ColorSupplier colorSupplier,
                                  int count, boolean random) {
        for (int i = 0; i < count; i++) {
            if (random) {
                figureArrayList.add(supplier.getRandomFigure(colorSupplier));
            } else {
                figureArrayList.add(supplier.getDefaultFigure());
            }
        }
    }

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        ArrayList<Figure> figureList = new ArrayList<>();

        addFigures(figureList, figureSupplier, colorSupplier, 3, true);
        addFigures(figureList, figureSupplier, colorSupplier, 3, false);
        for (Figure f : figureList) {
            f.draw();
        }
    }
}
