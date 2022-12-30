package shapes22;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    double getWidth(double width) {
        return 0;
    }

    @Override
    double setLength(double length) {
        return 0;
    }
}
