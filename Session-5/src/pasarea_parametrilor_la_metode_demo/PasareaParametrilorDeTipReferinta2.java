package pasarea_parametrilor_la_metode_demo;

import basic_classes_recap.Car;

public class PasareaParametrilorDeTipReferinta2 {

	public static void main(String[] args) {
		Car c = new Car("gri", "Opel", "Astra", 2200, 2000);
		System.out.println(c);

		//		tryToReassignCar(c);

		tryToUpdateCar(c);

		System.out.println(c);
	}

	//	public static void tryToReassignCar(Car c) {
	//		c = new Car("negru", "Audi", "A3", 6060, 2004);
	//	}

	public static void tryToUpdateCar(Car c) {
		c.setColor("rosu");
	}

}
