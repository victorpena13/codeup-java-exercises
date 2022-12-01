package shapes22;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2*this.length + 2*this.width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5,4);
        System.out.println("area: " + rectangle1.getArea());
        System.out.println("perimeter: " + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Square(5);
        System.out.println("area: " + rectangle2.getArea());
        System.out.println("perimeter: " + rectangle2.getPerimeter());

    }


}
