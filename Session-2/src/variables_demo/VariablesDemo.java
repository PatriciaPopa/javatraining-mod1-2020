package variables_demo;

public class VariablesDemo {
	// variabila membru - se afla in interiorul clasei, dar in afara oricarui bloc de cod
	int x;

	public static void main(String[] args) {
		// suma si suma1 sunt variabile locale, fiindca se afla in interiorul unei metode

		// declararea unei variabile - varianta 1, in doi pasi

		// declaratie fara initializare - pasul 1
		int suma;

		// initializare - pasul 2
		suma = 0;

		// declararea unei variabile - varianta 2, intr-un singur pas

		// declaratie + initializare
		int Suma = 6;

		// suma si suma1 sunt parametri pentru metoda println()
		System.out.println(suma);
		System.out.println(Suma);

		// -------------------------------------------------------------------------------------

		byte b = 6;
		short s = -32767;
		char c = 65;
		char cAsCharLiteral = 'r';
		int i = 543;
		long lo = 1;
		long lo1 = 1L;
		float f = 5;
		float f1 = 5.0f;
		float f2 = 5.23232332f;
		double d = 16;
		double d1 = 19.3f;
		double d2 = 19.3d;
		double d3 = 19.3;
		boolean b1 = true;
		boolean b2 = false;
		String str = "This is+a string, ~it can have spaces and other33stuff\n";

		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(cAsCharLiteral);
		System.out.println(i);
		System.out.println(lo);
		System.out.println(lo1);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.print(str);
		System.out.println("demo");

		// ---------------------------------------------------------------------------
		// aceste operatii se numesc concatenari de stringuri
		System.out.println("ceva" + b);
		System.out.println("ceva" + "  altceva");
		System.out.println(i + 2 + str); // echivalent cu (i + 2) + str

		// --------------------------------------------------------------------------
		int x = 7;
		x = 10;

		// constanta -> odata initializata, nu ii mai putem schimba valoarea
		final float PI = 3.14f;
		// PI = 5.0f;
	}
}
