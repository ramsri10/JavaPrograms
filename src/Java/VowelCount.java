package Java;

public class VowelCount {

	public static void main(String[] args) {

		String input = "hello";
		int count = 0;
		input =input.toLowerCase();
		
		for(char c: input.toCharArray()) {
		if	("shriram".indexOf(c)!=-1){
				count++;
			}
		}
		System.out.println(count);
	}

}
