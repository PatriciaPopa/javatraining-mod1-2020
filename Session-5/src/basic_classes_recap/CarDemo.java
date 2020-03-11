package basic_classes_recap;

public class CarDemo {

	public static void main(String[] args) {
		Car c1 = new Car("gri", "Opel", "Astra", 2200, 2000);
		// System.out.println("Is car for sale? "+ c1.isForSale());
		c1.sellCar();
		// System.out.println("Is car for sale? "+ c1.isForSale());
		c1.sellCar();
		// System.out.println("Is car for sale? "+ c1.isForSale());
	}

}
