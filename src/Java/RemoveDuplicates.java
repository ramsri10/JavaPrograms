package Java;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input = "testing is important in software devleopment testing";
		String result = "";
		String[] words = input.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (!result.contains(words[i] + " ")) {
				result += words[i] + " ";
			}
		}
		
		System.out.println(result.trim());
	}

}
