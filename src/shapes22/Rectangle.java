package shapes22;

public class Rectangle {

    protected double length;
    protected double width;

    public void Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return this.length+this.length+this.width+this.width;
    }


}
