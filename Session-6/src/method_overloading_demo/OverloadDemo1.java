package method_overloading_demo;

public class OverloadDemo1 {
	public static void main(String[] args) {
		add(1, 2);
		add(1.5f, 2.5f);
		add("Hello, ", "World!");
		add(5L, 1L);
		add(4.1, 1.5);
		add(1.5, 5.6f);
		add(9);
		add(new Long(4), new Long(3));
	}

	// 1 - observati ce se intampla cu apelul add(1, 2) cand comentam aceasta metoda (tineti cursorul pe el si vedeti
	// tipul parametrilor inainte si dupa comentarea metodei
	public static void add(int a, int b) {
		System.out.println("int called");
	}

	// 2
	public static void add(long a, long b) {
		System.out.println("long called");
	}

	// 3
	public static void add(Long a, Long b) {
		System.out.println("long called");
	}

	// 4
	public static void add(float a, float b) {
		System.out.println("float called");
	}

	// 5
	public static void add(Long...longs) {
		System.out.println("varargs called");
	}

	// 6
	public static void add(double a, double b) {
		System.out.println("double called");
	}

	// 7
	public static void add(String a, String b) {
		System.out.println("String called");
	}

	/* puteam, la fel de bine, sa pastram return typeul ca voi; diferenta in semnatura metodei e
	 * suficienta pentru o a diferentia de celelalte*/
	public static int add(int a) {
		System.out.println("single int called");
		return 1;
	}
}