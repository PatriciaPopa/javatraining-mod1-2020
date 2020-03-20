package recursion_demo;

public class FactorialDemo {

	public static void main(String[] args) {
		System.out.println(computeFactorial(1));
		System.out.println(computeFactorial(4));
	}

	public static int computeFactorial(int n) {
		if(n == 0) {
			return 1;
		}

		return n * computeFactorial(n-1);
	}
}
