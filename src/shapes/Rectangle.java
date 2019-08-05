package shapes;

abstract class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
    //    protected double length;
//    protected double width;
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//    public double getArea() {
//        return this.length*this.width;
//    }
//    public double getPerimeter() {
//        return this.length*2+ this.width*2;
//    }
//    public static void main(String[] args) {
//        Rectangle rec = new Rectangle(4,5);
//        System.out.println(rec.getArea());
//        System.out.println(rec.getPerimeter());
//    }
}
