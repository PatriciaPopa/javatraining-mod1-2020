
public class ConstantaDemo {
	public static final double CONSTANTA_PI = 3.14;

	public static final double CONSTANTA_EPSILON;

	public final int numarRandom;

	static {
		CONSTANTA_EPSILON = 56.9947;
	}

	{
		numarRandom = 9;
	}

	public static void main(String[] args) {
		System.out.println(ConstantaDemo.CONSTANTA_PI);
		System.out.println(ConstantaDemo.CONSTANTA_EPSILON);

		ConstantaDemo cd = new ConstantaDemo();

		System.out.println(cd.numarRandom);
	}
}
