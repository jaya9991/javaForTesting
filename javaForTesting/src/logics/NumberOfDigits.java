package logics;

public class NumberOfDigits {

	public static void main(String[] args) {

		NumberOfDigits nod = new NumberOfDigits();
		nod.getDigits(659764439);

	}

	public void getDigits(int number) {

		int count = 0;

		while (number > 0) {

			number = number / 10;

			count++;

		}

		System.out.println("total number of digits in the number are  " + count);

	}

}
