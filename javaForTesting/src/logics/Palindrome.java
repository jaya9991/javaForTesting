package logics;

public class Palindrome {

	public static void main(String[] args) {

		Palindrome pl = new Palindrome();
		pl.getPalin(12321);

	}

	public void getPalin(int number) {

		int num = number;

		int reverse = 0;

		while (number > 0) {

			reverse = (reverse) * 10 + (number % 10);

			number = number / 10;
		}

		if (num == reverse) {

			System.out.println("number is a palindrome");

		} else {

			System.out.println("number is not  a palindrome");

		}
	}

}
