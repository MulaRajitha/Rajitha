package OOPsAssignment;

abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Draw Rectangle");
	}
}
class Line  extends Shape{
	void draw() {
		System.out.println("Draw Line");
	}
}
class Cube extends Shape{
	void draw() {
		System.out.println("Draw Cube");
	}
}
public class Shapes{
	public static void main(String[] args)
	{
		Shape s;
		s=new Rectangle();
		s.draw();
		s=new Line();
		s.draw();
		s=new Cube();
		s.draw();
	}
}
