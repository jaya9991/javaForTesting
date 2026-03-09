package logics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
	

		 

		        int num = 153;
		        int realNum = num;
		        int remainder;
		        int result = 0;

		        while (num != 0) {
		            remainder = num % 10;
		            result = result + (remainder * remainder * remainder);
		            num= num / 10;
		        }

		        if (result == realNum) {
		            System.out.println(realNum + " is an Armstrong number");
		        } else {
		            System.out.println(realNum + " is not an Armstrong number");
		        }
		    }
		
		
		

	}


