package enum_demo;

public class AngajatDemo {
	public static void main(String[] args) {
		Angajat a1 = new Angajat("Ion Popescu", "cnp1", 9999.9, Departament.MANAGEMENT);
		Angajat a2 = new Angajat("Ana Popa", "cnp2", 888.9, Departament.IT);

		System.out.println(a1);
		System.out.println(a2);

		System.out.println(a1.getDepartament());
		System.out.println(a2.getDepartament());
	}
}
