import graphics.*;

public class Area {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();

        System.out.println("Area of Square: " + s.area(5, 0));
        System.out.println("Area of Rectangle: " + r.area(5, 3));
        System.out.println("Area of Triangle: " + t.area(2, 3));
        System.out.println("Area of Circle: " + c.area(6, 0));
    }
}