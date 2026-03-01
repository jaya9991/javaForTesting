package loops;

public class WordPrinting {

	String word = "PRINT";

	public static void main(String[] args) {

		WordPrinting sample = new WordPrinting();

		sample.getLetters();

	}

	public void getLetters() {

		for (int i = 0; i < 5; i++) {

			System.out.println( "index is :  " +i + "    letter is    " + word.charAt(i));

		}

	}

}
