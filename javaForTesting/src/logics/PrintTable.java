package logics;

public class PrintTable { // without using * operator

	public static void main(String[] args) {

		PrintTable pt = new PrintTable();

		pt.getTable(2);
	}

	public void getTable(int number) {

		for (int i = 0; i <= number*9; i += number) {

			int value = number;

			value = value + i;

			// number= value;

			System.out.println(value);

		}

	}

}
