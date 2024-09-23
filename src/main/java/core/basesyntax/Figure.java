package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void drawFigure() {
        System.out.println("Drawing a figure.");
    }

}
