package logics;

public class EvenNumber {

	public static void main(String[] args) {

		EvenNumber en = new EvenNumber();
		en.evenNum(15);

	}

	public void evenNum(int number) {

		if (number / 2 == 0) {

			System.out.println("number is even");
		}

		else {

			System.out.println("number is odd");
		}

	}

}
