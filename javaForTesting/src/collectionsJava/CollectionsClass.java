package collectionsJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsClass {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");

		System.out.println("ArrayList:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		Set<String> uniqueFruits = new HashSet<>();
		uniqueFruits.add("Apple");
		uniqueFruits.add("Banana");
		uniqueFruits.add("Apple");

		System.out.println("HashSet:");
		for (String fruit : uniqueFruits) {
			System.out.println(fruit);
		}

		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Alice");
		students.put(2, "Bob");
		students.put(3, "Charlie");

		System.out.println("HashMap:");
		for (Map.Entry<Integer, String> entry : students.entrySet()) {
			System.out.println(entry.getKey()  + entry.getValue());
		}
	}
}
