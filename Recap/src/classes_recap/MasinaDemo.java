package classes_recap;

public class MasinaDemo {
	public static void main(String[] args) {
		Masina masina = new Masina("Mercedes", "GLE Coupe", "Negru", 450.0, Tip.DUBA);

		System.out.println(masina.getPret());

		masina.setCuloare("Alb");

		System.out.println(masina.getCuloare());

		masina.aplicaDiscount();

		System.out.println(masina.getPret());
	}
}
