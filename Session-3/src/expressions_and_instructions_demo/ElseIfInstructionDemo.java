package expressions_and_instructions_demo;

public class ElseIfInstructionDemo {
	public static void main(String[] args) {
		boolean isWinter = false;
		boolean isSummer = false;

		if(isWinter) {
			System.out.println("Ninge");
		}
		else if(isSummer) {
			System.out.println("Ce cald e");
		}
		else if(!isWinter && !isSummer) {
			System.out.println("Poate e primavara, poate e toamna");
		}
		else {
			System.out.println("Unknown");
		}

		System.out.println("Asta se afiseaza mereu");
	}
}
