package logics;

public class ReturnLargestDigit {

	public static void main(String[] args) {

		ReturnLargestDigit rld = new ReturnLargestDigit();
		int store = rld.getLargest(5812934);

		System.out.println(store);

	}

	public int getLargest(int number) {

		int largest = 0;

		while (number > 0) {

			int digit = number % 10;

			if (digit > largest) {

				largest = digit;

			}

			number = number / 10;
		}

		return largest;

	}

}
