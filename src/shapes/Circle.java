package shapes;

import util.Input;
public class Circle {
    private double radius;

    public void setRadius(double r) {
        this.radius = r;
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.print("what is the radius of circle: ");
        String userRadius = input.getString();
    }


}
