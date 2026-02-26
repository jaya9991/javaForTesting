package logics;

public class IfElseStatement {

	public void rollTheDice(int num) {

		if (num == 1) {

			System.out.println("You rolled 1");
		}

		if (num == 2) {

			System.out.println("You rolled 2");
		}

		if (num == 3) {

			System.out.println("You rolled 3");
		}

		if (num == 4) {

			System.out.println("You rolled 4");
		}

		if (num == 5) {

			System.out.println("You rolled 5");
		}

		if (num == 6) {

			System.out.println("You rolled 6");
		}

		else {
			
			System.out.println("Number not on the dice");
		}
	}

	public static void main(String[] args) {

		 IfElseStatement roll = new  IfElseStatement();
		 
		 int number = 10;
		 
		 roll.rollTheDice(number);
		
		
	}
}
