package shapes;
import util.Input;
import static java.lang.Double.parseDouble;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Input input = new Input();
        System.out.print("what is the radius of circle: ");
        String userRadius = input.getString();
        circle.setRadius(parseDouble(userRadius));
        System.out.println("radius: " + circle.getRadius());
        System.out.println("area: " + circle.getArea(circle.getRadius()));
        System.out.println("circumference: " + circle.getCircumference(circle.getRadius()));
    }
}