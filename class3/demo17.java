package class3;


abstract class Shape{
	public double width;
	public double height;
	public double radius;
	public double pie=3.14f;
	
	public abstract double getArea();
}

class Rectangle extends Shape{
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	public void draw(){
        System.out.println("Dwawing Rectangle...");
    }
	
	public double getArea() {
		return(width*height);
	}
}
	
class Circle extends Shape{
		public Circle(double radius) {
			this.radius=radius;
			
		}
		public void draw(){
	        System.out.println("Drawing Circle...");
	    }
		@Override
		public double getArea() {
			return(pie*radius*radius);
		}
}
public class demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(50,60);
        rectangle.draw();
        Circle circle = new Circle(5);
        circle.draw();

        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
	}

}
