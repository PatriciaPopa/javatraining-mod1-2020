package methods_demo;

public class Test {
	public static void main(String[] args) {
		System.out.println("Before method call");
		//displayWelcomeMessage();
		System.out.println("After method call");

		//int sum = add(1, 2);

		double mean = getMean(new double[] {5, 5, 2, 6, 1, 9});
	}

	//	/* method with no return type and no parameters */
	//	public static void displayWelcomeMessage() {
	//		System.out.println("Welcome, dear friend!");
	//	}
	//
	//	/* method with return type int and two parameters */
	//	public static int add(int a, int b) {
	//		return a + b;
	//	}

	public static double getMean(double[] arr) {
		int mean = 0;
		int sum = computeSum(arr);

		mean = sum / arr.length;

		return mean;
	}

	private static int computeSum(double[] arr) {
		int sum = 0;

		for(double currentValue : arr) {
			sum += currentValue;
		}

		return sum;
	}
}
