package shapes22;

public class Square extends Quadrilateral {

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side=side;
    }


    @Override
    double getWidth(double width) {
        return side;
    }

    @Override
    double setLength(double length) {
        return 0;
    }
}
