package shapes2022;

import java.util.Scanner;


public class Circle {
    Scanner scanner = new Scanner(System.in);
    private double radius;

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double pi = Math.PI;
        double radiusSquared = Math.pow(this.radius,2);
        return pi*radiusSquared;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }



}
