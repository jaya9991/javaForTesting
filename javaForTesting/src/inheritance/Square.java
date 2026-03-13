package inheritance;

public class Square  extends Shape {
	
	
	 int sides =4;
	 int vertices=4;
	 int sumOfAngles=360;
	 int area=10;
	 
	 
	 //Square constructor with no parameters
	Square() {
		 
		System.out.println("sqaure is a shape"); 
		calcArea();                // this method is called when an object is created. 
		
		
	 }
	
	public void calcArea() {
		
		
		System.out.println("Area of square");
	}
	
	public void calcPerimeter()  {
		
		
		
		System.out.println("Perimeter of square");
	}
	
	public static void main(String[] args) {
		
		Square sq = new Square();
		
		
	}
	

}
