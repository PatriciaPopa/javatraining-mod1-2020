package enhanced_order;

public class EnhancedOrderDemo {
	public static void main(String[] args) {
		EnhancedOrder o1 = new EnhancedOrder();

		executeMethodSuite(o1);

		o1.setStatus(EnhancedStatus.READY);

		executeMethodSuite(o1);

		o1.setStatus(EnhancedStatus.DELIVERED);

		executeMethodSuite(o1);
	}

	private static void executeMethodSuite(EnhancedOrder o1) {
		System.out.println(o1.isDeliverable());
		System.out.println(o1.isOrdered());
		System.out.println(o1.isReady());
		System.out.println(o1.isDelivered());
		o1.printTimeToDeliver();
		System.out.println();
	}
}
