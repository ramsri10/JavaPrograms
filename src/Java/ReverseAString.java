package Java;

public class ReverseAString {

	public static void main(String[] args) {

		String s = "madam";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		/**
		 * 2nd logic
		 */
		String original = "madam";
		StringBuilder sb = new StringBuilder(original);
		String reverse = sb.reverse().toString();
		System.out.println(reverse);
		
		if(original.equals(reverse)) {
			System.out.println("Palindrome");
		}

		/*
		 * 3rd logic
		 */
		
		StringBuilder reve = new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--) {
			reve.append(s.charAt(i));
		}
		//reve.toString();
		
		
		System.out.println(reve);
	}
	
	

}

