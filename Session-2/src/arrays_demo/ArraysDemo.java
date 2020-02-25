package arrays_demo;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		// varianta 1, in doi pasi
		int[] arr; // declaratie
		arr = new int[5]; // initializare

		// varianta 2, intr-un singur pas
		int[] arr1 = new int[5];

		String[] cartileMelePreferate = {"Jane Eyre", "Quo Vadis", "Heidi"};

		String[] sir = new String[3];

		System.out.println(sir);
		System.out.println(Arrays.toString(sir));

		System.out.println(arr[0]);
		arr[0] = 10;
		System.out.println(arr[0]);

		// System.out.println(arr[5]);
		// System.out.println(arr[-1]);
		System.out.println(arr[4]);

		// ca sa aflam lungimea unui sir:
		System.out.println(arr.length);
		System.out.println(cartileMelePreferate.length);
	}
}
