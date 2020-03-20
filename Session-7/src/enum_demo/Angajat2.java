package enum_demo;

public class Angajat2 {
	private String numeSiPrenume;
	private String cnp;
	private double salariu;
	private Departament2 departament;

	public Angajat2(String numeSiPrenume, String cnp, double salariu, Departament2 departament) {
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

	public Departament2 getDepartament() {
		return departament;
	}

	public void setDepartament(Departament2 departament) {
		this.departament = departament;
	}

	@Override
	public String toString() {
		return "Angajat2 [numeSiPrenume=" + numeSiPrenume + ", cnp=" + cnp + ", salariu=" + salariu + ", departament="
				+ departament + "]";
	}
}

enum Departament2{
	HR("Resurse umane"), IT("Information Technology"), MGMT("Management");

	private final String fullName;

	Departament2(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}
}