package inheritance;

public class Test {

	public static void main(String[] args) {

		Shape sh = new Shape();
		System.out.println(sh.numberOfSides);
	
		// sh.calcArea();

		Shape s = new Square();
		// s.calcArea();
		s.numberOfSides = 5;
		
	
		System.out.println(s.numberOfSides);
		
		
	
	
		
        
		
		Square sq = new Square();
		// sq.calcArea();

		// System.out.println(sq.sides);

		Triangle t = new Triangle();
		t.calcArea();

	}

}
