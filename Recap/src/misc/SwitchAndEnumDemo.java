package misc;

import java.util.Scanner;

public class SwitchAndEnumDemo {
	public static void main(String[] args) {
		LunaAnului luna = LunaAnului.DECEMBRIE;

		switch(luna) {
		case IANUARIE:
			System.out.println("ian");
			break;
		case FEBRUARIE:
			System.out.println("feb");
			break;
			/* si tot asa :) */
		default:
			System.out.println("alta luna");
			break;
		}

		/* ---------------------------------- */

		System.out.println("Introduceti un numar de la 1 in sus: ");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		in.close();

		switch(x) {
		case 1:
			System.out.println("unu");
			break;
		case 2:
			System.out.println("doi");
			break;
			/* si tot asa :) */
		default:
			System.out.println("altu'");
			break;
		}
	}
}

enum LunaAnului {
	IANUARIE, FEBRUARIE, MARTIE, APRILIE, MAI, IUNIE, IULIE, AUGUST, SEPTEMBRIE, OCTOMBRIE, NOIEMBRIE, DECEMBRIE
}