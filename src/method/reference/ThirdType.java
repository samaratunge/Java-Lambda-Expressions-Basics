package method.reference;

import java.util.Arrays;

public class ThirdType {

	public static void main(String[] args) {

		String[] stringArray = { "Sam", "Richard", "Ann", "Udara", "John", "Peter", "Yasho" };

		/*
		 * Method reference to an instance method of an arbitrary object of a
		 * particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);

		for (String str : stringArray) {
			System.out.println(str);
		}
	}
}
