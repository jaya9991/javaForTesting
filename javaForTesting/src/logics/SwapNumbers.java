package logics;

public class SwapNumbers {

	public static void main(String[] args) {
		SwapNumbers sn = new SwapNumbers();
		
		sn.doTheSwap(10, 20);
		
		

	}
	
	
	public void doTheSwap(int num1, int num2) {
		
     num1 = num1 + num2;
     
     num2= num1-num2;
		
	num1= num1-num2;	
	
	System.out.println(num1 + "  " + num2);
		
	}

}
