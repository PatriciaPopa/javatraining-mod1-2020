package expressions_and_instructions_demo;

import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Scrie un numar de la 1 la 7, care corespunde unei zile a saptamanii: ");

		int ziuaSaptamanii = scn.nextInt();

		switch(ziuaSaptamanii) {
		case 1:
			System.out.println("Azi e luni");
			break;

		case 2:
			System.out.println("Azi e marti");
			break;

		default:
			System.out.println("Asta nu e o zi a saptamanii");
			break;
		}

		System.out.println("Asta se executa mereu");

		scn.close();
	}
}
