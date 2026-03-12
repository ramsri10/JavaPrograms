package Java;

import java.util.ArrayList;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 3, 5 };
		int n = arr.length;

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (!al.contains(arr[i])) {
				al.add(arr[i]);
			}
		}
		System.out.println(al);
	}

}
