package enum_demo;

public class Angajat {
	private String numeSiPrenume;
	private String cnp;
	private double salariu;
	private Departament departament;

	public Angajat(String numeSiPrenume, String cnp, double salariu, Departament departament) {
		this.numeSiPrenume = numeSiPrenume;
		this.cnp = cnp;
		this.salariu = salariu;
		this.departament = departament;
	}

	public String getNumeSiPrenume() {
		return numeSiPrenume;
	}

	public void setNumeSiPrenume(String numeSiPrenume) {
		this.numeSiPrenume = numeSiPrenume;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public double getSalariu() {
		return salariu;
	}

	public void setSalariu(double salariu) {
		this.salariu = salariu;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	@Override
	public String toString() {
		return "Angajat [numeSiPrenume=" + numeSiPrenume + ", cnp=" + cnp + ", salariu=" + salariu + ", departament="
				+ departament + "]";
	}

}

enum Departament{
	HR, IT, MANAGEMENT
}
