package graphics;
public class Area
{
public static void main(String args[])
	{
		Square s=new Square();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		System.out.println("Area of square: "+s.area(4,0));
		System.out.println("Area of rectangle: "+r.area(2,4));
		System.out.println("Area of triangle: "+t.area(3,6));
		System.out.println("Area of circle: "+c.area(5,0));
	}