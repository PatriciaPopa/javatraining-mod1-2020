package arrays_demo;

import java.util.Arrays;

public class MultidimensionalArrayDemo {

	public static void main(String[] args) {
		int[][] matrix = new int[4][];

		/* veti observa ca afiseaza [null, null, null, null]; asta e din cauza
		 * ca sirurile sunt tot obiecte, si vor fi by default initializate pe null */
		System.out.println(Arrays.deepToString(matrix));

		// varianta 1
		//matrix[0] = new int[] {1, 2, 3};

		// varianta 2
		matrix[0] = new int[3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;

		matrix[1] = new int[1];
		matrix[1][0] = 5;

		matrix[2] = new int[] {7, 8, 9, 10, 11};

		matrix[3] = new int[2];
		matrix[3][0] = 3;
		matrix[3][1] = 4;

		//System.out.println(Arrays.toString(matrix));
		System.out.println(Arrays.deepToString(matrix));
	}

}
