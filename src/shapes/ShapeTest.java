package shapes;

public class ShapeTest {

    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(4,3);
        Square squareOne = new Square(4.0);
        System.out.println(rectangleOne.getPerimeter());
        System.out.println(rectangleOne.getArea());
        System.out.println(squareOne.getPerimeter());
        System.out.println(squareOne.getArea());
    }

}
