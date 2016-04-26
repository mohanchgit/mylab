import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "CRICKET";

		char[] array = name.toCharArray();

		List<Character> names = new ArrayList<Character>();

		for (Character cr : array) {

		names.add(cr);

		}

		for (char c : array) {

		System.out.println(c + ": " + Collections.frequency(names, c));

		}

	}

}
