package other.shapeinfo;

import other.shapeinfo.model.Circle;
import other.shapeinfo.model.Rectangle;
import other.shapeinfo.model.Triangle;

import java.util.Scanner;

class Tester {
	private Circle circle = new Circle();
	private Rectangle rectangle = new Rectangle();
	private Triangle triangle = new Triangle();
	private static double area;
	private static double perimeter;
	private static Scanner sc = new Scanner(System.in);

	public void acceptRecordForCircle() {
		System.out.println("Enter radius	:	");
		this.circle.setRadius(sc.nextInt());
	}

	public void acceptRecordForRectangle() {
		System.out.println("Enter width	:	");
		this.rectangle.setWidth(sc.nextInt());
		System.out.println("Enter Height	:	");
		this.rectangle.setHeight(sc.nextInt());
	}

	public void acceptRecordForTriangle() {
		System.out.println("Enter Base	:	");
		this.triangle.setBase(sc.nextInt());
		System.out.println("Enter Height	:	");
		this.triangle.setHeight(sc.nextInt());
	}

	public void printRecordForCircle() {
		area = Circle.pI * this.circle.getRadius() * this.circle.getRadius();
		System.out.println("Area of Circle " + area);
		perimeter = 2 * Circle.pI * this.circle.getRadius();
		System.out.println("Perimter of Circle " + perimeter);
	}

	public void printRecordForRectangle() {
		area = this.rectangle.getWidth() * this.rectangle.getHeight();
		System.out.println("Area of Rectangle " + area);
		perimeter = 2 * (this.rectangle.getWidth() + this.circle.getRadius());
		System.out.println("Perimter of Rectangle " + perimeter);
	}

	public void printRecordForTriangle() {
		area = (this.triangle.getBase() * this.triangle.getHeight()) / 2;
		System.out.println("Area of triangle " + area);
		perimeter = 2 * Circle.pI * this.circle.getRadius();
		System.out.println("Perimter of Circle " + perimeter);
	}

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("2.Triangle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
}

