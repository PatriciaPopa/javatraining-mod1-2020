package misc;

public class PassingParamsToMethodsRecap {
	public static void main(String[] args) {
		int x = 1;
		doSomething1(x);
		System.out.println(x);

		StringBuilder sb = new StringBuilder("val init");
		doSomething2(sb);
		System.out.println(sb);
	}

	public static void doSomething1(int x) {
		x = 5;
	}

	public static void doSomething2(StringBuilder sb) {
		//		sb = new StringBuilder("noua valoare");
		sb.append("111");
	}
}
