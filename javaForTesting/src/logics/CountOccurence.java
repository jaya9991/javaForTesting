package logics;

public class CountOccurence {

	public static void main(String[] args) {

		CountOccurence co = new CountOccurence();
		int sample = co.getCount(16126822);

		System.out.println(sample);
		
	}

	public int getCount(int number) {

		int count = 0;
		int digit = 0;
		 
		 {

		      while (number > 0) {
  
		     	digit = number % 10;

			  if (digit == 6) {

			      	count++;

			}

			number = number / 10;
		}

		return count;

	}
	}
}
