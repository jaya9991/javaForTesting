package logics;

public class ModernFamilyTrivia {

	public void characterSays(String person) {

		if (person == "Phil") {

			System.out.println("Nature’s healing sunburn remedy? H(ALLOEEEEEEEEEEEEEEEEE)");

		}

		if (person == "Claire") {

			System.out.println("I will organize everything...including you!!");

		}

		if (person == "Jay") {

			System.out.println("Honey, there's a gun in the footlocker in the garage.");
		}

		if (person == "Gloria") {

			System.out.println("What do you call the takatakatakataka....Helicopter");
		}

		if (person == "Cam") {

			System.out.println("Life is too short to wear boring socks or not sing");
		}

		if (person == "Mitchell") {

			System.out.println("Or we could avoid a glitter apocalypse");
		}

		/*
		 * else {
		 * 
		 * System.out.println("STICK TO THE SCRIPT"); }
		 */

	}

	public void characterSaysAgain(String load) {

		switch (load) {
		case "Phil":
			System.out.println("Nature’s healing sunburn remedy? H(ALLOEEEEEEEEEEEEEEEEE)");
			break;

		case "Claire":
			System.out.println("I will organize everything...including you!!");
			break;

		case "Jay":
			System.out.println("Honey, there's a gun in the footlocker in the garage.");
			break;

		case "Gloria":
			System.out.println("What do you call the takatakatakataka....Helicopter");
			break;

		case "Cam":
			System.out.println("Life is too short to wear boring socks or not sing");
			break;

		case "Mitchell":
			System.out.println("Or we could avoid a glitter apocalypse");
			break;

		default:
			System.out.println("STICK TO THE SCRIPT");
			break;
		}

	}

	public static void main(String[] args) {

		String load = "Cam";

		ModernFamilyTrivia trivia = new ModernFamilyTrivia();
	//	trivia.characterSays(load); // using IF ELSE its slower as it stops at every IF block
		trivia.characterSaysAgain(load);     // using switch statement more efficient, cleaner code

		System.out.println("guess who said that?");
		System.out.println(load);

	}
}