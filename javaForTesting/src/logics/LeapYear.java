package logics;

public class LeapYear {

	public static void main(String[] args) {

		LeapYear current = new LeapYear();
		current.getResult(2028);

	}

	public void getResult(int given) {    //parametrize things that are subject to change 
		// int given = 2028;
		int year = given % 4;

		String result = (year == 0) ? "Its a leap year" : "Not a leap year";

		System.out.println(result);

	}

}
