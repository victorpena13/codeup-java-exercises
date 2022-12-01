package shapes22;

public class Square extends Rectangle {
    double side;
    public Square(double side) {

        super(side,side);
        this.side= side;
    }

    @Override
    public double getPerimeter() {
        System.out.print("override: ");
        return 4*side;
    }

    @Override
    public double getArea() {
        System.out.print("override: ");
        return Math.pow(side, 2);
    }

}
