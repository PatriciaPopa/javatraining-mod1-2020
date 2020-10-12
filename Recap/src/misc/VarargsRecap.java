package misc;
import java.util.Arrays;

public class VarargsRecap {
	public static void main(String[] args) {
		//		doVarargsDemo();
		//		doVarargsDemo(1);
		doVarargsDemo(5,2,56,8);
		//		doVarargsDemo(new int[] {1,2,3});
	}

	private static void doVarargsDemo(int... params) {
		System.out.println(Arrays.toString(params));
		System.out.println(params[1]);
		params[1] = 8;
		System.out.println(Arrays.toString(params));
	}

	//	private static void doVarargsDemo(int[] params) {
	//		System.out.println(Arrays.toString(params));
	//	}

}
