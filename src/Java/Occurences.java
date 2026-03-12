package Java;

import java.util.HashMap;
import java.util.Map;

public class Occurences {

	public static void getCharCount(String name) {
		Map<Character, Integer> ch = new HashMap<Character, Integer>();

		char str[] = name.toCharArray();

		for (char c : str) {

			if (!String.valueOf(c).isBlank()) {
				if (ch.containsKey(c)) {

					ch.put(c, ch.get(c) + 1);
				} else {
					ch.put(c, 1);
				}

			}
		}
		System.out.println(name + ":" + ch);
	}

	public static void main(String[] args) {
		getCharCount("This is white horse");
		getCharCount("test");

	}


//**
// * for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//**/
	
}