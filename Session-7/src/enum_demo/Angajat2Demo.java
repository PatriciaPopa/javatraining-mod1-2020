package enum_demo;

public class Angajat2Demo {
	public static void main(String[] args) {
		Angajat2 a1 = new Angajat2("Ion Popescu", "cnp1", 9999.9, Departament2.MGMT);
		Angajat2 a2 = new Angajat2("Ana Popa", "cnp2", 888.9, Departament2.IT);

		System.out.println(a1);
		System.out.println(a2);

		System.out.println(a1.getDepartament().getFullName());
		System.out.println(a2.getDepartament().getFullName());

		System.out.println(Departament2.HR.getFullName());
	}
}
