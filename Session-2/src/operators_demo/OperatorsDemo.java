package operators_demo;

public class OperatorsDemo {
	public static void main(String[] args) {
		// ---------------------------------operatori unari----------------------------------------------
		int a = 1;
		a++; // se poate scrie si ca a = a+1;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);

		// ---------------------------------------------------------------------------
		int b = 5;
		b--; // se poate scrie si ca b = b-1;
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);

		// ---------------------------------------------------------------------------
		int c = 1;
		++c; // se poate scrie si ca c = c+1;
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);

		// ---------------------------------------------------------------------------
		int d = 5;
		--d; // se poate scrie si ca d = d-1;
		System.out.println(d);
		System.out.println(--d);
		System.out.println(d);

		// ---------------------------------------------------------------------------
		System.out.println(+d);
		System.out.println(-d);

		// ---------------------------------------------------------------------------

		System.out.println(~2);

		boolean bo = true;

		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!bo);

		// ---------------------------------operatori binari----------------------------------------------
		System.out.println(7 * 8);
		int n = 4;
		System.out.println(n * n * 2);

		// ---------------------------------------------------------------------------

		System.out.println(8 / 5);
		System.out.println(8 / n);
		System.out.println(8.0 / 5);

		// ---------------------------------------------------------------------------

		System.out.println(8 % 2);
		System.out.println(8 % 3);

		// ---------------------------------------------------------------------------
		System.out.println(n + n);

		// ---------------------------------------------------------------------------
		System.out.println(1 - 9);

		// ---------------------------------------------------------------------------
		//System.out.println(n = 6); // operatorul de asignare, NU operatorul de egalitate
		System.out.println(n == 6);
		System.out.println(n != 6);

		int x = 1;
		int y = 2;

		System.out.println(x < y);
		System.out.println(x > y);
		System.out.println(x <= y);
		System.out.println(x >= y);

		String s = "blabla";
		System.out.println(s instanceof String);

		// ---------------------------------------------------------------------------
		int x1 = 1;
		int x2 = 2;

		System.out.println(x1 & x2);
		System.out.println(1 & 3);

		System.out.println(x1 | 3);

		System.out.println(1 ^ 3);

		// ---------------------------------------------------------------------------
		boolean userIsProgrammer = true;
		boolean userIsBritish = false;

		System.out.println("Is the user a British programmer? " + (userIsProgrammer && userIsBritish));
		System.out.println("Is the user at least Britsh or at least a programmer? " + (userIsProgrammer || userIsBritish));

		// ------------------------------ternary operator-----------------------------------------
		int z = 0;

		System.out.println((z > 1) ? "z is positive" : "z is negative or equal to 0");
		System.out.println((z > 1) ? "z is positive" : (z < 0) ? "z is negative" : "z is equal to 0");

		// ------------------------------assignment operators-----------------------------------------
		int nr = 0;
		nr += 5; // echivalent cu nr = nr + 5;
		System.out.println(nr);


		nr -= 2; // echivalent cu nr = nr - 2;
		System.out.println(nr);

		nr *= nr; // echivalent cu nr = nr * nr;
		System.out.println(nr);

		nr /= 2; // echivalent cu nr = nr / 2;
		System.out.println(nr);

		int p = 5;
		p %= 2; // echivalent cu p = p % 2;
		System.out.println(p);

		p = 5;
		p &= 2; // echivalent cu p = p & 2;
		System.out.println(p);

		// ------------------------------shifting operators (sunt tot pe biti)-----------------------------------------
		System.out.println(3 << 2); // il shiftam pe 3 cu 2 pozitii spre stanga

		System.out.println(12 >> 2); // il shiftam pe 12 cu 2 pozitii spre dreapta

		int binary1 = 00111100;

		System.out.println(binary1 >>> 2);

		// ---------------------------------------------------------------------------

		int a1, b1;
		// (a1 = b1) = 5; //cititi mesajul de eroare
		a1 = b1 = 5;
		System.out.println(a1);
		System.out.println(b1);
	}
}
