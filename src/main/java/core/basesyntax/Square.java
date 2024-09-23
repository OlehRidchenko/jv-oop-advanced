package core.basesyntax;

public class Square extends Figure {
    private double firstLeg;

    public Square(String color, double firstLeg) {
        super(color);
        this.firstLeg = firstLeg;
    }

    public double calculateArea() {
        return firstLeg * firstLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, " + "area: "
                + calculateArea() + "sq. units, side: "
                + firstLeg + " units, color: " + getColor());
    }
}