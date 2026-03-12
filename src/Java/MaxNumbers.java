package Java;

import java.util.Arrays;

public class MaxNumbers {

	public static void main(String[] args) {
		int num1 = 3217;
		int num2 = 4586;

		// String concat = String.valueOf(num1) + String.valueOf(num2);
		String concat = num1 + "" + num2;
		char[] value = concat.toCharArray();
		Arrays.sort(value);
		StringBuilder result = new StringBuilder(new String(value));
		result.reverse();
		System.out.println(result);
		
	}

}
