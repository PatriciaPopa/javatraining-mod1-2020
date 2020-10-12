package classes_recap;

enum Tip {
	AUTOTURISM, DUBA, TIR, AUTOBUZ
}

public class Masina {
	private String marca;
	private String model;
	private String culoare;
	private double pret;
	private Tip tip;

	public Masina(String marca, String model, String culoare, double pret, Tip tip) {
		this.marca = marca;
		this.model = model;
		this.culoare = culoare;
		this.pret = pret;
		this.tip = tip;
	}

	public double getPret() {
		return pret;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public String getCuloare() {
		return this.culoare;
	}

	public void aplicaDiscount() {
		if(this.tip == Tip.TIR || this.tip == Tip.AUTOBUZ) {
			this.pret = this.pret - (20.0/100) * this.pret;
		}
		else if(this.tip == Tip.DUBA) {
			this.pret = this.pret - ((double)15/100) * this.pret;
		}
		else {
			this.pret = this.pret - (5/100d) * this.pret;
		}
	}
}
