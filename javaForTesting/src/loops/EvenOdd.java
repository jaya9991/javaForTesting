package loops;

public class EvenOdd {

	public static void main(String[] args) {

		EvenOdd sample = new EvenOdd();

		sample.calculateEven();
		sample.calculateOdd();

	}

	public void calculateEven() {

		int sum = 0;

		for (int i = 0; i <= 100; i += 2) {

			sum = i + sum;
			// System.out.println(sum);

		}

		System.out.println("The sum of the all the even numbers from 1-100 is:   "  + sum);
	}

	public void calculateOdd() {

		int sum = 0;

		for (int i = 1; i <= 100; i += 2) {

			sum = i + sum;
			//System.out.println(sum);
		}
		System.out.println("The sum of all the odd numbers from 1-100 is:   "  + sum);
	}
}
