package pasarea_parametrilor_la_metode_demo;

public class PasareaParametrilorDeTipPrimitiv {
	public static void main(String[] args) {
		int n = 8;
		System.out.println(n);
		tryToChangeParameter(n);
		System.out.println(n);
	}

	public static void tryToChangeParameter(int n) {
		// acest n este o copie a variabilei n, din metoda main()
		// acest n va disaparea in momentul in care metoda isi termina executia
		n = 10;
	}
}
