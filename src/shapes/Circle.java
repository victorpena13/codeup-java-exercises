package shapes;

import util.Input;
public class Circle {
    private double radius;

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getArea(double radius) {
        return Math.PI * (radius * radius) ;
    }


    public static void main(String[] args) {

    }


}
