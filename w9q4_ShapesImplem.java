
// package weeks;
import java.util.Scanner;

interface Shape {
	double area();

	void print();
}

class Rect implements Shape {
	double length, width;

	public void set(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	public void print() {
		System.out.println("Area of the rectangle is: " + area());
	}
}

class Circle implements Shape {
	double radius;

	void set(double radius) {
		this.radius = radius;
	}

	public double area() {
		return (3.14 * this.radius * this.radius);
	}

	public void print() {
		System.out.println("The area of the circle: " + area());
	}
}

public class w9q4_ShapesImplem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// calculating for rectangle
		System.out.println("Enter the length and breadth of rectangle: ");
		double w = sc.nextDouble();
		double l = sc.nextDouble();
		Rect r = new Rect();
		r.set(l, w);
		r.print();

		// calculating fir circle
		System.out.println("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		Circle c = new Circle();
		c.set(radius);
		c.print();

		sc.close();
	}

}