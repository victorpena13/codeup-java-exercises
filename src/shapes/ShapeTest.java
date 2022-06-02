package shapes;

public class ShapeTest {

    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(4,3);
        System.out.println(rectangleOne.getPerimeter());
        System.out.println(rectangleOne.getArea());

        Square squareOne = new Square(4.0);
        System.out.println(squareOne.getPerimeter());
        System.out.println(squareOne.getArea());

        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }

}
