package classes_demo;

public class NumarRealDemo {
	public static void main(String[] args) {

		/* NumarReal e clasa
		 * nr1 si n2 sunt instante ale clasei*/
		NumarReal nr1 = new NumarReal();
		NumarReal nr2 = new NumarReal();

		System.out.println(nr1.doarDeTest);
		System.out.println(nr1.parteFractionara);

		System.out.println(nr2.doarDeTest);
		System.out.println(nr2.parteFractionara);

		// System.out.println(nr1.parteIntreaga);
		// System.out.println(nr2.parteIntreaga);

		System.out.println(nr1.getParteIntreaga());
		nr1.setParteIntreaga(5);
		nr1.setParteFractionara(0.5);

		NumarReal nr3 = new NumarReal(6, 0.2);
		System.out.println(nr3);
	}
}
