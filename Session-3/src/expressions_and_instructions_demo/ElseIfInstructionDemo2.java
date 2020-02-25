package expressions_and_instructions_demo;

import java.util.Scanner;

public class ElseIfInstructionDemo2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Scrie un numar de la 1 la 7, care corespunde unei zile a saptamanii: ");

		int ziuaSaptamanii = scn.nextInt();

		if(ziuaSaptamanii == 1) {
			System.out.println("Azi e luni");
		}
		else if(ziuaSaptamanii == 2) {
			System.out.println("Azi e marti");
		}
		else if(ziuaSaptamanii == 3) {
			System.out.println("Azi e miercuri");
		}
		else {
			System.out.println("Introduceti un numar intre 1 si 7");
		}

		scn.close();
	}
}
