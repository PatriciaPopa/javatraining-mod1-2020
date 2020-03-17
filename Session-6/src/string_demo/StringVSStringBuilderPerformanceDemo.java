package string_demo;

public class StringVSStringBuilderPerformanceDemo {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		String s = "";

		for(int i=0; i<=100000; i++) {
			s += i;
		}

		long endTime = System.nanoTime();

		System.out.println(endTime - startTime);


		// -------------------------------------------

		long startTime1 = System.nanoTime();

		StringBuilder sb = new StringBuilder("");

		for(int i=0; i<=100000; i++) {
			sb.append(i);
		}

		long endTime1 = System.nanoTime();

		System.out.println(endTime1 - startTime1);
	}
}
