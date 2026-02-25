package learnJava;

public class CalculatorTest {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Calculator!");
		
		Calculator calculator = new Calculator();
		calculator.add(20,10,5,"The sum of the numbers is:  ");
		calculator.subtract(10,10,10,"The difference of the numbers is:  ");
		calculator.multiply(20,10,5,"The product of the numbers is:  ");
		calculator.divide(20,10,5,"The quotient of the numbers is:  ");
		
		
		
		
	}

}

