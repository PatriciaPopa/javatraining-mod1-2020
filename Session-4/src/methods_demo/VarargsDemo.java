package methods_demo;

public class VarargsDemo {
	public static void main(String[] args) {
		/* cand folosim varargs, putem apela metoda atat cu un sir, cat si cu o lista variabila de argumente;
		 * daca am fi folosit sir, nu puteam apela metoda decat cu varianta in care ii pasam un sir de numere */
		getMean(new double[] {5, 5, 2, 6, 1, 9});
		getMean(5, 5, 2, 6, 1, 9);

		/* linia de mai jos trebuie comentata, fiindca va cauza o eroare aritmetica de impartire la zero, din cauza ca
		 * incercam sa impartim suma la numarul de elemente, care in cazul nostru e 0 */
		// getMean();
		getMean(5, 5);
	}

	/* in lista de parametri se observa sintaxa pentru varargs (in spate e folosit tot un sir) */
	public static double getMean(double... arr) {
		int mean = 0;
		int sum = computeSum(arr);

		/* chiar daca folosim varargs, variabila arr este tratata ca un sir obisnuit */
		// System.out.println(arr[0]);

		mean = sum / arr.length;

		return mean;
	}

	private static int computeSum(double... arr) {
		int sum = 0;

		for(double currentValue : arr) {
			sum += currentValue;
		}

		return sum;
	}
}
