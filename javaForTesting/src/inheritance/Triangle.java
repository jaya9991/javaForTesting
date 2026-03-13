package inheritance;

public class Triangle extends Shape {

	int sides;
	int sumOfAngles;

	Triangle() {

		System.out.println("This is a triangle");
	}

	public void calcArea() {

		System.out.println("Area of triangle");

	}

	public void calcPerimeter() {

		System.out.println("Perimeter of trianlge");

	}

	public static void main(String[] args) {

		Triangle tg = new Triangle();

	}
}
