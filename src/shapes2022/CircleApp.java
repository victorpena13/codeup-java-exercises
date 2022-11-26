package shapes2022;
import util2022.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("radius: ");
        Double userRadius = input.getDouble();

        Circle circle1 = new Circle(userRadius);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

    }
}
