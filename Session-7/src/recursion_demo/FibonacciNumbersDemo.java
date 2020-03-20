package recursion_demo;

public class FibonacciNumbersDemo {
	public static void main(String[] args) {
		// in cazul nostru, al 4-lea element este 3, fiindca sirul arata asa:
		// 0 1 1 2 3 5 8 13 21 ...
		// si incepem sa numaram de la 0
		System.out.println(computeNthFibonacciNumberVer1(4));
		System.out.println(computeNthFibonacciNumberVer1(-94));
	}

	public static int computeNthFibonacciNumberVer1(int n) {
		if(n <= 1) {
			return n;
		}

		return computeNthFibonacciNumberVer1(n-1) + computeNthFibonacciNumberVer1(n-2);
	}
}
