import Shapes.Rectangle;
import Shapes.Triangle;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 6, 8);
        triangle.showPerimetr();

        Rectangle rectangle = new Rectangle(200, 200);
        rectangle.showPerimetr();
    }
}
