package logics;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		
		
		int number1 =0;
		int number2 = 1;
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(number1);
			
			int next = number1 + number2;
			number1 = number2;
			
			number2 = next;
			
			
		}

	}

}
