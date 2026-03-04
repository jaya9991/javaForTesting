package logics;

public class SumOfDigits {

	public static void main(String[] args) {

		SumOfDigits sod = new SumOfDigits();
		int result = sod.addition(62315213);
		System.out.println(result);

	}

	public int addition(int number) {

		int sum = 0;

		while (number > 0) {

			int digit = number % 10;
			sum = sum + digit;

			number = number / 10;

		}
		return sum;

	}

}
