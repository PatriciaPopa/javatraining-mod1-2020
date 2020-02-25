package expressions_and_instructions_demo;

public class SwitchDemo {
	public static void main(String[] args) {
		String ziuaSaptamanii = "Marti";
		// ziuaSaptamanii = ziuaSaptamanii.toUpperCase();

		switch(ziuaSaptamanii) {
		case "luni":
			System.out.println("Azi e luni");
			break;

		case "marti":
			System.out.println("Azi e marti");
			break;

		default:
			System.out.println("Asta nu e o zi a saptamanii");
		}

		System.out.println("Asta se executa mereu");
	}
}
