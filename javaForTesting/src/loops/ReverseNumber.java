package loops;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number = 12345;
		int reversed = 0;

		do {

			reversed = (reversed) * 10 + (number % 10);

			number = number / 10;

			// System.out.println(reversed);

		}

		while (number > 0);

		System.out.println(reversed);


	}

}
