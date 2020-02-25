package expressions_and_instructions_demo;

public class ReturnDemo {
	public static void main(String[] args) {
		System.out.println(interceptAddMethod(1, 2));
	}

	static int interceptAddMethod(double a, double b) {
		return (int) add(a, b);
	}

	static double add(double a, double b) {
		System.out.println("Asta se executa");

		return a + b;
	}
}
