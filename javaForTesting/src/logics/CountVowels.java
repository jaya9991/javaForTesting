package logics;

public class CountVowels {

	public static void main(String[] args) {

		String name = "javafortesting";

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			char word = name.charAt(i);

			if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {

				count++;

			}

		}

		System.out.println(count);

	}

}
