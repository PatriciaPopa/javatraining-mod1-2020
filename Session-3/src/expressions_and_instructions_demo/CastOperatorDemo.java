package expressions_and_instructions_demo;

public class CastOperatorDemo {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		double rez = ((double) a) / b;
		// System.out.println(rez);

		int x = (int) rez; // cast explicit, fiindca incercam sa punem un tip de date mai wide intr-unul mai narrow
		double d = a;// cast implicit, fiindca incercam sa punem un tip de date mai narrow intr-unul mai wide
	}
}
