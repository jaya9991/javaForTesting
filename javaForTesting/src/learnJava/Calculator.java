package learnJava;

public class Calculator {

//	int num1;
//	int num2;

	public void add(int num1, int num2, int num3, String arg) {

		System.out.println(arg + (num1+num2+num3));
	}

	public void subtract(int num1, int num2, int num3,String arg ) {
		
		if(num1<num2 && num2<num3) {
			
			System.out.println("OH NO YOURE BANKRUPT!!");
			
		} else {
		
		System.out.println(arg + (num1-num2-num3));
		}
	}

	public void multiply(int num1, int num2, int num3,String arg) {
		
		System.out.println(arg + (num1*num2*num3));
	}

	public void divide(int num1, int num2, int num3,String arg) {
		
		System.out.println(arg + (num1/num2/num3));
	}

}
