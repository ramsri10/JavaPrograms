package Java;

import java.util.HashMap;
import java.util.Map;

public class ReverseCharPreserveSpaces {

	public static void main(String[] args) {
		String s = "Automation";

		s = s.toLowerCase();
		int n = s.length();

//		for(int i=0;i<n-1;i++) {
//			int count=0;
//			for(int j=1;j<n;j++) {
//				if(i!=j &&s.charAt(i)==s.charAt(j)) {
//					count++;
//				}			
//			}
//			
//			if(count == 0) {
//				System.out.println(s.charAt(i));
//			break;
//			}
//		}

//		for (int i = 0; i < n; i++) { //second approach
//			boolean isUnique = true;
//			for (int j = 0; j < n; j++) {
//				if (i != j && s.charAt(i) == s.charAt(j)) {
//					isUnique = false;
//					break;
//
//				}
//			}
//			if (isUnique) {
//				System.out.println(s.charAt(i));
//			}
//		}

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);

		}
		for (char c : s.toCharArray()) {
			if (hm.get(c) == 1) {
				System.out.println(c);
				//break;
			}
		}
	}

}
