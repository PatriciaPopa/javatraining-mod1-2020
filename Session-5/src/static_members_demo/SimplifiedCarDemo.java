package static_members_demo;

public class SimplifiedCarDemo {

	public static void main(String[] args) {
		//System.out.println(SimplifiedCar.counter);

		SimplifiedCar sc1 = new SimplifiedCar("gri");
		// Se pooate si asa, dar observati mesajul din Warning
		// System.out.println(sc1.counter);
		//System.out.println(SimplifiedCar.counter);

		SimplifiedCar sc2 = new SimplifiedCar("gri");

		//System.out.println(SimplifiedCar.counter);
		System.out.println(sc1.counter);
		System.out.println(sc2.counter);

		//		sc2.setColor("roz");
		//		System.out.println(sc1.counter);
		//		System.out.println(sc2.counter);
	}
}
