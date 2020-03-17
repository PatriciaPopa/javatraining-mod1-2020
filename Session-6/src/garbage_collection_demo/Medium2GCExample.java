package garbage_collection_demo;

class Rabbit{

}

public class Medium2GCExample {
	public static void main(String[] args) {
		Rabbit one = new Rabbit();
		Rabbit two = new Rabbit();
		Rabbit three = one; // aici?
		one = null; // aici?
		Rabbit four = one;
		three = null; // aici?
		two = null; // aici?
		two = new Rabbit(); // aici?
		System.gc();
	}
}