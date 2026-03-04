package logics;

public class ReturnSquare {

	public static void main(String[] args) {

		ReturnSquare rs = new ReturnSquare();
		int create = rs.getSquare(5);
		
		System.out.println("The square of the number is  " + create);

	}

	public int getSquare(int number) {

		int square = number * number;

		return square;

	}

}
