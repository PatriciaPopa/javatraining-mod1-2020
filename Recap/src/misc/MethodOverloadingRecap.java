package misc;

public class MethodOverloadingRecap {
	private static final double PI = 3.14;
	//	private static int var = 123;

	public static void main(String[] args) {
		//		MethodOverloadingRecap m1 = new MethodOverloadingRecap();
		//		MethodOverloadingRecap m2 = new MethodOverloadingRecap();
		//
		//		System.out.println(m1.var);
		//		System.out.println(m2.var);
		//
		//		m1.var = 6;
		//
		//		System.out.println(m1.var);
		//		System.out.println(m2.var);
		//
		//		m2.var = 999;
		//
		//		System.out.println(m1.var);
		//		System.out.println(m2.var);

		System.out.println(computePerimeter(3)); // cerc
		System.out.println(computePerimeter(2.0)); // patrat
		System.out.println(computePerimeter(3,5)); // dreptunghi
		System.out.println(computePerimeter(1,2,3)); // triunghi
	}

	private static double computePerimeter(int r) {
		return 2 * PI * r;
	}

	private static double computePerimeter(double lat) {
		return 4 * lat;
	}

	private static double computePerimeter(double L, double lat) {
		return 2*L + 2*lat;
	}

	private static double computePerimeter(double lat1, double lat2, double lat3) {
		return lat1 + lat2 + lat3;
	}
}
