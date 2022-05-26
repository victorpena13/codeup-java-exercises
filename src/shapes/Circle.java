package shapes;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getArea(double radius) {
        return Math.PI * (radius * radius) ;
    }
    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
