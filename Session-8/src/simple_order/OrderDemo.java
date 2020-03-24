package simple_order;
public class OrderDemo {
	public static void main(String[] args) {
		Order o1 = new Order();

		executeMethodSuite(o1);

		o1.setStatus(Order.Status.READY);

		executeMethodSuite(o1);

		o1.setStatus(Order.Status.DELIVERED);

		executeMethodSuite(o1);
	}

	private static void executeMethodSuite(Order o1) {
		System.out.println(o1.isDeliverable());
		System.out.println(o1.isOrdered());
		System.out.println(o1.isReady());
		System.out.println(o1.isDelivered());
		System.out.println();
	}
}
